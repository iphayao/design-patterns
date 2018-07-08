package com.iphayao.demo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class DemoTest {
    public final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    AbstractLogger loggerChain;

    @Before
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
        loggerChain = getChainOfLoggers();
    }

    @Test
    public void testChainOfResponsibilityConsoleLogger() {
        String expected = "File::Logger: This is an information" + lineSeparator();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
        assertEquals(expected, outputStream.toString());
    }

    @Test
    public void testChainOfResponsibilityFileLogger() {
        String expected = "File::Logger: This is an debug level information" + lineSeparator();
        expected += "File::Logger: This is an debug level information" + lineSeparator();
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information");
        assertEquals(expected, outputStream.toString());
    }

    @Test
    public void testChainOfResponsibilityErrorLogger() {
        String expected = "Error Console::Logger: This is an error information" + lineSeparator();
        expected += "File::Logger: This is an error information" + lineSeparator();
        expected += "File::Logger: This is an error information" + lineSeparator();
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
        assertEquals(expected, outputStream.toString());
    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new FileLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}