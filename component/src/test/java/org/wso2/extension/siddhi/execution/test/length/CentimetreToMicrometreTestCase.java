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

package org.wso2.extension.siddhi.execution.test.length;

import io.siddhi.core.SiddhiAppRuntime;
import io.siddhi.core.SiddhiManager;
import io.siddhi.core.event.Event;
import io.siddhi.core.exception.SiddhiAppCreationException;
import io.siddhi.core.query.output.callback.QueryCallback;
import io.siddhi.core.stream.StreamJunction;
import io.siddhi.core.stream.input.InputHandler;
import io.siddhi.core.util.EventPrinter;
import org.apache.log4j.Logger;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.wso2.extension.siddhi.execution.test.util.UnitTestAppender;

/**
 * Test for UnitConversion CentimetreToMicrometre function
 */
public class CentimetreToMicrometreTestCase {

    private static Logger logger = Logger.getLogger(CentimetreToMicrometreTestCase.class);
    protected static SiddhiManager siddhiManager;

    @Test
    public void testProcessForCentimetreToMicrometre() throws Exception {
        logger.info("UnitConversionForCentimetreToMicrometreFunctionExtension TestCase");

        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForCentimetreToMicrometreStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForCentimetreToMicrometreStream "
                + " select unitconversion:cmToum(inValue) "
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
                    AssertJUnit.assertEquals((Double) 10000.0, result);
                }
            }
        });
        InputHandler inputHandler = siddhiAppRuntime.getInputHandler
                ("UnitConversionForCentimetreToMicrometreStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{1.0});
        Thread.sleep(100);
        siddhiAppRuntime.shutdown();
    }

    @Test
    public void testProcessForCentimetreToMicrometre2() throws Exception {
        logger.info("UnitConversionForCentimetreToMicrometreFunctionExtension2 TestCase");

        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForCentimetreToMicrometreStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForCentimetreToMicrometreStream "
                + " select unitconversion:cmToum(inValue) "
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
        InputHandler inputHandler = siddhiAppRuntime.getInputHandler
                ("UnitConversionForCentimetreToMicrometreStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{0});
        Thread.sleep(100);
        siddhiAppRuntime.shutdown();
    }

    @Test
    public void testProcessForCentimetreToMicrometre3() throws Exception {
        logger.info("UnitConversionForCentimetreToMicrometreFunctionExtension3 TestCase");

        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForCentimetreToMicrometreStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForCentimetreToMicrometreStream "
                + " select unitconversion:cmToum(inValue) "
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
                    AssertJUnit.assertEquals((Double) 2.147483647E13, result);
                }
            }
        });
        InputHandler inputHandler = siddhiAppRuntime.getInputHandler
                ("UnitConversionForCentimetreToMicrometreStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{2147483647});
        Thread.sleep(100);
        siddhiAppRuntime.shutdown();
    }

    @Test(expectedExceptions = SiddhiAppCreationException.class)
    public void testProcessForCentimetreToMicrometre4() throws Exception {
        logger.info("UnitConversionForCentimetreToMicrometreFunctionExtension4 TestCase");
        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForCentimetreToMicrometreStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForCentimetreToMicrometreStream "
                + " select unitconversion:cmToum() "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        siddhiManager.createSiddhiAppRuntime(siddhiApp + eventFuseSiddhiApp);
    }

    @Test(expectedExceptions = SiddhiAppCreationException.class)
    public void testProcessForCentimetreToMicrometre5() throws Exception {
        logger.info("UnitConversionForCentimetreToMicrometreFunctionExtension5 TestCase");
        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForCentimetreToMicrometreStream (inValue string); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForCentimetreToMicrometreStream "
                + " select unitconversion:cmToum(inValue) "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        siddhiManager.createSiddhiAppRuntime(siddhiApp + eventFuseSiddhiApp);
    }

    @Test
    public void testProcessForCentimetreToMicrometre6() throws Exception {
        logger.info("UnitConversionForCentimetreToMicrometreFunctionExtension6 TestCase");
        logger = Logger.getLogger(StreamJunction.class);
        UnitTestAppender appender = new UnitTestAppender();
        logger.addAppender(appender);
        siddhiManager = new SiddhiManager();
        String siddhiApp = "define stream UnitConversionForCentimetreToMicrometreStream (inValue int); ";

        String eventFuseSiddhiApp = ("@info(name = 'query1') from UnitConversionForCentimetreToMicrometreStream "
                + " select unitconversion:cmToum(inValue) "
                + "as UnitConversionValue "
                + " insert into OutMediationStream;");
        SiddhiAppRuntime siddhiAppRuntime = siddhiManager
                .createSiddhiAppRuntime(siddhiApp + eventFuseSiddhiApp);

        InputHandler inputHandler = siddhiAppRuntime.getInputHandler
                ("UnitConversionForCentimetreToMicrometreStream");
        siddhiAppRuntime.start();
        inputHandler.send(new Object[]{null});
        AssertJUnit.assertTrue(appender.getMessages().contains("Input to the UnitConversion function "
                                                                       + "cannot be null"));
        siddhiAppRuntime.shutdown();
    }

}
