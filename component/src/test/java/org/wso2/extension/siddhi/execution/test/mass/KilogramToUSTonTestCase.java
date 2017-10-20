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
import org.wso2.extension.siddhi.execution.test.util.UnitTestAppender;
import org.wso2.siddhi.core.SiddhiAppRuntime;
import org.wso2.siddhi.core.SiddhiManager;
import org.wso2.siddhi.core.event.Event;
import org.wso2.siddhi.core.exception.SiddhiAppCreationException;
import org.wso2.siddhi.core.executor.function.FunctionExecutor;
import org.wso2.siddhi.core.query.output.callback.QueryCallback;
import org.wso2.siddhi.core.stream.input.InputHandler;
import org.wso2.siddhi.core.util.EventPrinter;

/**
 * Test for UnitConversion KilogramToUSTon function
 */
public class KilogramToUSTonTestCase {

    private static Logger logger = Logger.getLogger(KilogramToUSTonTestCase.class);
    protected static SiddhiManager siddhiManager;

    @Test
    public void testProcessForKilogramToUSTon() throws Exception {
        logger.info("UnitConversionForKilogramToUSTonFunctionExtension TestCase");

        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForKilogramToUSTonStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForKilogramToUSTonStream "
                + " select unitconversion:kgToST(inValue) "
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
                    AssertJUnit.assertEquals((Double) 0.00110231, result);
                }
            }
        });
        InputHandler inputHandler = siddhiAppRuntime.getInputHandler("UnitConversionForKilogramToUSTonStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{1.0});
        Thread.sleep(100);
        siddhiAppRuntime.shutdown();
    }

    @Test
    public void testProcessForKilogramToUSTon2() throws Exception {
        logger.info("UnitConversionForKilogramToUSTonFunctionExtension2 TestCase");

        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForKilogramToUSTonStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForKilogramToUSTonStream "
                + " select unitconversion:kgToST(inValue) "
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
        InputHandler inputHandler = siddhiAppRuntime.getInputHandler("UnitConversionForKilogramToUSTonStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{0});
        Thread.sleep(100);
        siddhiAppRuntime.shutdown();
    }

    @Test
    public void testProcessForKilogramToUSTon3() throws Exception {
        logger.info("UnitConversionForKilogramToUSTonFunctionExtension3 TestCase");

        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForKilogramToUSTonStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForKilogramToUSTonStream "
                + " select unitconversion:kgToST(inValue) "
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
                    AssertJUnit.assertEquals((Double) 2367192.69892457, result);
                }
            }
        });
        InputHandler inputHandler = siddhiAppRuntime.getInputHandler("UnitConversionForKilogramToUSTonStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{2147483647});
        Thread.sleep(100);
        siddhiAppRuntime.shutdown();
    }

    @Test (expectedExceptions = SiddhiAppCreationException.class)
    public void testProcessForKilogramToUSTon4() throws Exception {
        logger.info("UnitConversionForKilogramToUSTonFunctionExtension4 TestCase");
        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForKilogramToUSTonStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForKilogramToUSTonStream "
                + " select unitconversion:kgToST() "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        siddhiManager.createSiddhiAppRuntime(siddhiApp + eventFuseSiddhiApp);
    }

    @Test (expectedExceptions = SiddhiAppCreationException.class)
    public void testProcessForKilogramToUSTon5() throws Exception {
        logger.info("UnitConversionForKilogramToUSTonFunctionExtension5 TestCase");
        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForKilogramToUSTonStream (inValue string); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForKilogramToUSTonStream "
                + " select unitconversion:kgToST(inValue) "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        siddhiManager.createSiddhiAppRuntime(siddhiApp + eventFuseSiddhiApp);
    }

    @Test
    public void testProcessForKilogramToUSTon6() throws Exception {
        logger.info("UnitConversionForKilogramToUSTonFunctionExtension6 TestCase");
        logger = Logger.getLogger(FunctionExecutor.class);
        UnitTestAppender appender = new UnitTestAppender();
        logger.addAppender(appender);
        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForKilogramToUSTonStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForKilogramToUSTonStream "
                + " select unitconversion:kgToST(inValue) "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        SiddhiAppRuntime siddhiAppRuntime = siddhiManager
                .createSiddhiAppRuntime(siddhiApp + eventFuseSiddhiApp);

        InputHandler inputHandler = siddhiAppRuntime.getInputHandler("UnitConversionForKilogramToUSTonStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{null});
        AssertJUnit.assertTrue(appender.getMessages().contains("Input to the UnitConversion function "
                                                                       + "cannot be null"));
        siddhiAppRuntime.shutdown();
    }
}
