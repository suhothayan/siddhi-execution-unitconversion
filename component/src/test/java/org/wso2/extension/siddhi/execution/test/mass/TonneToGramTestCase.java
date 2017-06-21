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
package org.wso2.extension.siddhi.execution.test.mass;

import org.apache.log4j.Logger;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.wso2.siddhi.core.SiddhiAppRuntime;
import org.wso2.siddhi.core.SiddhiManager;
import org.wso2.siddhi.core.event.Event;
import org.wso2.siddhi.core.query.output.callback.QueryCallback;
import org.wso2.siddhi.core.stream.input.InputHandler;
import org.wso2.siddhi.core.util.EventPrinter;

/**
 * Test for UnitConversion TonneToGram function
 */
public class TonneToGramTestCase {

    private static Logger logger = Logger.getLogger(TonneToGramTestCase.class);
    protected static SiddhiManager siddhiManager;

    @Test
    public void testProcessForTonneToGram() throws Exception {
        logger.info("UnitConversionForTonneToGramFunctionExtension TestCase");

        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForTonneToGramStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForTonneToGramStream "
                + " select unitconversion:tTog(inValue) "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        SiddhiAppRuntime siddhiAppRuntime = siddhiManager
                .createSiddhiAppRuntime(siddhiApp + eventFuseSiddhiApp);

        siddhiAppRuntime.addCallback("query1", new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents,
                                Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                Double result;
                for (Event event : inEvents) {
                    result = (Double) event.getData(0);
                    AssertJUnit.assertEquals((Double) 1000000.0, result);
                }
            }
        });
        InputHandler inputHandler = siddhiAppRuntime.getInputHandler("UnitConversionForTonneToGramStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{1.0});
        Thread.sleep(100);
        siddhiAppRuntime.shutdown();
    }

    @Test
    public void testProcessForTonneToGram2() throws Exception {
        logger.info("UnitConversionForTonneToGramFunctionExtension2 TestCase");

        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForTonneToGramStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForTonneToGramStream "
                + " select unitconversion:tTog(inValue) "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        SiddhiAppRuntime siddhiAppRuntime = siddhiManager
                .createSiddhiAppRuntime(siddhiApp + eventFuseSiddhiApp);

        siddhiAppRuntime.addCallback("query1", new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents,
                                Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                Double result;
                for (Event event : inEvents) {
                    result = (Double) event.getData(0);
                    AssertJUnit.assertEquals((Double) 0.0, result);
                }
            }
        });
        InputHandler inputHandler = siddhiAppRuntime.getInputHandler("UnitConversionForTonneToGramStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{0});
        Thread.sleep(100);
        siddhiAppRuntime.shutdown();
    }

    @Test
    public void testProcessForTonneToGram3() throws Exception {
        logger.info("UnitConversionForTonneToGramFunctionExtension3 TestCase");

        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForTonneToGramStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForTonneToGramStream "
                + " select unitconversion:tTog(inValue) "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        SiddhiAppRuntime siddhiAppRuntime = siddhiManager
                .createSiddhiAppRuntime(siddhiApp + eventFuseSiddhiApp);

        siddhiAppRuntime.addCallback("query1", new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents,
                                Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                Double result;
                for (Event event : inEvents) {
                    result = (Double) event.getData(0);
                    AssertJUnit.assertEquals((Double) 2.147483647E15, result);
                }
            }
        });
        InputHandler inputHandler = siddhiAppRuntime.getInputHandler("UnitConversionForTonneToGramStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{2147483647});
        Thread.sleep(100);
        siddhiAppRuntime.shutdown();
    }
}
