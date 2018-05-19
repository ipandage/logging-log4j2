package com.log4j.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author gxg
 * @date 2018/5/19 上午11:09
 */
public class Log4j2Test {
    private static final Logger logger = LogManager.getLogger(Log4j2Test.class);

    public static void main(String[] args) {

        for (int i=0;i<1000;i++){
            logger.info("{}","test-"+i);
//            logger.error("");
//            logger.debug("");
//            logger.trace("");
//            logger.fatal("");
//            logger.warn("");

        }

//        MDC.put("username", "admin");
//        MDC.put("sessionID", "1234");
//
//        if (logger.isTraceEnabled()) {
//            logger.debug("log4j trace message");
//        }
//        if (logger.isDebugEnabled()) {
//            logger.debug("log4j debug message");
//        }
//        if (logger.isInfoEnabled()) {
//            logger.debug("log4j info message");
//        }
//        if(logger.isErrorEnabled()){
//            logger.error(null,"log4j error message");
//        }
    }
}
