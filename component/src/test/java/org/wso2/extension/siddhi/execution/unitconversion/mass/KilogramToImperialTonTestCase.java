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
package org.wso2.extension.siddhi.execution.unitconversion.mass;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.wso2.siddhi.core.ExecutionPlanRuntime;
import org.wso2.siddhi.core.SiddhiManager;
import org.wso2.siddhi.core.event.Event;
import org.wso2.siddhi.core.query.output.callback.QueryCallback;
import org.wso2.siddhi.core.stream.input.InputHandler;
import org.wso2.siddhi.core.util.EventPrinter;

/**
 * Test for UnitConversion KilogramToImperialTon function
 */
public class KilogramToImperialTonTestCase {

    private static Logger logger = Logger.getLogger(KilogramToImperialTonTestCase.class);
    protected static SiddhiManager siddhiManager;

    @Test
    public void testProcessForKilogramToImperialTon() throws Exception {
        logger.info("UnitConversionForKilogramToImperialTonFunctionExtension TestCase");

        siddhiManager = new SiddhiManager();
        String executionPlan = "define stream UnitConversionForKilogramToImperialTonStream (inValue int); ";

        String eventFuseExecutionPlan = ("@info(name = 'query1') from UnitConversionForKilogramToImperialTonStream "
                + " select unitconversion:kgToImperialTon(inValue) "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        ExecutionPlanRuntime executionPlanRuntime = siddhiManager
                .createExecutionPlanRuntime(executionPlan + eventFuseExecutionPlan);

        executionPlanRuntime.addCallback("query1", new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents,
                                Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                Double result;
                for (Event event : inEvents) {
                    result = (Double) event.getData(0);
                    Assert.assertEquals((Double) 0.000984207, result);
                }
            }
        });
        InputHandler inputHandler = executionPlanRuntime.getInputHandler("UnitConversionForKilogramToImperialTonStream");
        executionPlanRuntime.start();
        inputHandler.send(new Object[]{1.0});
        Thread.sleep(100);
        executionPlanRuntime.shutdown();
    }

    @Test
    public void testProcessForKilogramToImperialTon2() throws Exception {
        logger.info("UnitConversionForKilogramToImperialTonFunctionExtension2 TestCase");

        siddhiManager = new SiddhiManager();
        String executionPlan = "define stream UnitConversionForKilogramToImperialTonStream (inValue int); ";

        String eventFuseExecutionPlan = ("@info(name = 'query1') from UnitConversionForKilogramToImperialTonStream "
                + " select unitconversion:kgToImperialTon(inValue) "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        ExecutionPlanRuntime executionPlanRuntime = siddhiManager
                .createExecutionPlanRuntime(executionPlan + eventFuseExecutionPlan);

        executionPlanRuntime.addCallback("query1", new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents,
                                Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                Double result;
                for (Event event : inEvents) {
                    result = (Double) event.getData(0);
                    Assert.assertEquals((Double) 0.0, result);
                }
            }
        });
        InputHandler inputHandler = executionPlanRuntime.getInputHandler("UnitConversionForKilogramToImperialTonStream");
        executionPlanRuntime.start();
        inputHandler.send(new Object[]{0});
        Thread.sleep(100);
        executionPlanRuntime.shutdown();
    }

    @Test
    public void testProcessForKilogramToImperialTon3() throws Exception {
        logger.info("UnitConversionForKilogramToImperialTonFunctionExtension3 TestCase");

        siddhiManager = new SiddhiManager();
        String executionPlan = "define stream UnitConversionForKilogramToImperialTonStream (inValue int); ";

        String eventFuseExecutionPlan = ("@info(name = 'query1') from UnitConversionForKilogramToImperialTonStream "
                + " select unitconversion:kgToImperialTon(inValue) "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        ExecutionPlanRuntime executionPlanRuntime = siddhiManager
                .createExecutionPlanRuntime(executionPlan + eventFuseExecutionPlan);

        executionPlanRuntime.addCallback("query1", new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents,
                                Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                Double result;
                for (Event event : inEvents) {
                    result = (Double) event.getData(0);
                    Assert.assertEquals((Double) 2113568.437762929, result);
                }
            }
        });
        InputHandler inputHandler = executionPlanRuntime.getInputHandler("UnitConversionForKilogramToImperialTonStream");
        executionPlanRuntime.start();
        inputHandler.send(new Object[]{2147483647});
        Thread.sleep(100);
        executionPlanRuntime.shutdown();
    }
}