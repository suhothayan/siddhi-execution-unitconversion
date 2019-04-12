/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.extension.siddhi.execution.unitconversion.length;

import io.siddhi.annotation.Example;
import io.siddhi.annotation.Extension;
import io.siddhi.annotation.Parameter;
import io.siddhi.annotation.ReturnAttribute;
import io.siddhi.annotation.util.DataType;
import io.siddhi.core.config.SiddhiQueryContext;
import io.siddhi.core.exception.SiddhiAppRuntimeException;
import io.siddhi.core.executor.ExpressionExecutor;
import io.siddhi.core.executor.function.FunctionExecutor;
import io.siddhi.core.util.config.ConfigReader;
import io.siddhi.core.util.snapshot.state.State;
import io.siddhi.core.util.snapshot.state.StateFactory;
import io.siddhi.query.api.definition.Attribute;
import io.siddhi.query.api.exception.SiddhiAppValidationException;

import javax.measure.UnitConverter;

import static tec.units.ri.unit.MetricPrefix.CENTI;
import static tec.units.ri.unit.MetricPrefix.NANO;
import static tec.units.ri.unit.Units.METRE;

/**
 * Siddhi Function for UnitConversion Centimetre to Nanometre
 */
@Extension(
        name = "cmTonm",
        namespace = "unitconversion",
        description = "This converts the input given in centimeters into nanometers.",
        parameters = @Parameter(
                name = "p1",
                description = "The value that needs to be converted from centimeters into nanometers.",
                type = {DataType.INT, DataType.LONG, DataType.FLOAT, DataType.DOUBLE}),
        returnAttributes = @ReturnAttribute(
                description = "The value that is returned in nanometers.",
                type = {DataType.DOUBLE}),
        examples = @Example(
                syntax = "define stream UnitConversionForCentimetreToNanometreStream (inValue int); \n" +
                        "from UnitConversionForCentimetreToNanometreStream \n" +
                        "select unitconversion:cmTonm(inValue) as UnitConversionValue \n" +
                        "insert into OutMediationStream;",
                description = "The values in centimeters obtained from " +
                        "'UnitConversionForCentimetreToNanometreStream' input stream is converted into nanometers" +
                        " and returned to the 'OutMediationStream' output stream."
        )
)
public class CentimetreToNanometre extends FunctionExecutor {

    private UnitConverter converter;

    /**
     * The initialization method for CentimetreToNanometre, this method will be called before the other methods
     *
     * @param attributeExpressionExecutors are the executors of each function parameters
     * @param configReader                 This hold the {@link FunctionExecutor} extensions configuration reader.
     * @param siddhiQueryContext           the context of the siddhi query
     */
    @Override
    protected StateFactory init(ExpressionExecutor[] attributeExpressionExecutors, ConfigReader configReader,
                                SiddhiQueryContext siddhiQueryContext) {
        converter = CENTI(METRE).getConverterTo(NANO(METRE));
        if (attributeExpressionExecutors.length != 1) {
            throw new SiddhiAppValidationException("Invalid no of arguments passed to " +
                    "unitconversion:cmTonm() function, " +
                    "required 1, but found " + attributeExpressionExecutors.length);
        }
        Attribute.Type attributeType = attributeExpressionExecutors[0].getReturnType();
        if (!((attributeType == Attribute.Type.DOUBLE)
                || (attributeType == Attribute.Type.INT)
                || (attributeType == Attribute.Type.FLOAT)
                || (attributeType == Attribute.Type.LONG))) {
            throw new SiddhiAppValidationException("Invalid parameter type found " +
                    "for the argument of UnitConversion function, " +
                    "required " + Attribute.Type.INT + " or " + Attribute.Type.LONG +
                    " or " + Attribute.Type.FLOAT + " or " + Attribute.Type.DOUBLE +
                    ", but found " + attributeType.toString());
        }
        return null;
    }

    /**
     * The main execution method which will be called upon event arrival
     * when there are more than one function parameter
     *
     * @param data the runtime values of function parameters
     * @param state current query state
     * @return the function result
     */
    @Override
    protected Object execute(Object[] data, State state) {
        return null;
    }

    /**
     * The main execution method which will be called upon event arrival
     * when there are zero or one function parameter
     *
     * @param data null if the function parameter count is zero or
     *             runtime data value of the function parameter
     * @param state current query state
     * @return the function result
     */
    @Override
    protected Object execute(Object data, State state) {
        if (data != null) {
            //type-conversion
            return converter.convert((Number) data);
        } else {
            throw new SiddhiAppRuntimeException("Input to the UnitConversion function cannot be null");
        }
    }

    @Override
    public Attribute.Type getReturnType() {
        return Attribute.Type.DOUBLE;
    }
}
