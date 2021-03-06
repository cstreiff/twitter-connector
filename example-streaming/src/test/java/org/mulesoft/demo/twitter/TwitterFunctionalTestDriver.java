/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mulesoft.demo.twitter;

import static org.junit.Assert.*;

import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.transport.PropertyScope;
import org.mule.construct.SimpleFlowConstruct;
import org.mule.tck.FunctionalTestCase;

import org.junit.Test;

public class TwitterFunctionalTestDriver extends FunctionalTestCase
{

    @Override
    protected String getConfigResources()
    {
        return "mule-config.xml";
    }

    public void testStream() throws Exception
    {
        Thread.sleep(20000);
    }
    
    @Test
    public void testGroupStatusesByLanguage() throws Exception
    {
        System.out.println(lookupFlowConstruct("GroupStatusesByLanguage").process(getTestEvent("")).getMessage().getPayloadAsString());
    }
    
    private SimpleFlowConstruct lookupFlowConstruct(final String name)
    {
        return (SimpleFlowConstruct) muleContext.getRegistry().lookupFlowConstruct(name);
    }

}
