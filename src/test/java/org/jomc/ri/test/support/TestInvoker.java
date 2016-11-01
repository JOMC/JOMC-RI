// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 * Java Object Management and Configuration
 * Copyright (C) Christian Schulte <cs@schulte.it>, 2005-206
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   o Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   o Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in
 *     the documentation and/or other materials provided with the
 *     distribution.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * $JOMC$
 *
 */
// </editor-fold>
// SECTION-END
package org.jomc.ri.test.support;

import java.util.Arrays;
import java.util.Iterator;
import org.jomc.model.Instance;
import org.jomc.ri.DefaultInvocation;
import org.jomc.ri.DefaultInvoker;
import org.jomc.spi.Invocation;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Test {@code Invoker} implementation.
 *
 * <dl>
 *   <dt><b>Identifier:</b></dt><dd>JOMC ⁑ RI ⁑ Tests ⁑ Test Invoker</dd>
 *   <dt><b>Name:</b></dt><dd>JOMC ⁑ RI ⁑ Tests ⁑ Test Invoker</dd>
 *   <dt><b>Specifications:</b></dt>
 *     <dd>org.jomc.spi.Invoker</dd>
 *   <dt><b>Abstract:</b></dt><dd>No</dd>
 *   <dt><b>Final:</b></dt><dd>No</dd>
 *   <dt><b>Stateless:</b></dt><dd>No</dd>
 * </dl>
 *
 * @author <a href="mailto:cs@schulte.it">Christian Schulte</a> 1.0
 * @version 2.0.0-SNAPSHOT
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 2.0.0-SNAPSHOT", comments = "See http://www.jomc.org/jomc-tools/2.0.0-SNAPSHOT" )
// </editor-fold>
// SECTION-END
public class TestInvoker extends DefaultInvoker
{
    // SECTION-START[Invoker]
    // SECTION-END
    // SECTION-START[TestInvoker]

    @Override
    public Invocation postInvoke( final Invocation invocation )
    {
        final StringBuilder b = new StringBuilder();
        b.append( invocation.getObject().toString() );

        if ( invocation.getContext().get( DefaultInvocation.INSTANCE_KEY ) != null )
        {
            b.append( "[" ).append( ( (Instance) invocation.getContext().get( DefaultInvocation.INSTANCE_KEY ) ).
                getIdentifier() ).append( "]: " );

        }

        b.append( invocation.getMethod().getName() ).append( "( " );

        if ( invocation.getArguments() != null )
        {
            for ( final Iterator it = Arrays.asList( invocation.getArguments() ).iterator(); it.hasNext(); )
            {
                b.append( it.next() );
                if ( it.hasNext() )
                {
                    b.append( ", " );
                }
            }
        }

        b.append( " ): " ).append( invocation.getResult() );
        System.out.println( b.toString() );
        return invocation;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">
    /** Creates a new {@code TestInvoker} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 2.0.0-SNAPSHOT", comments = "See http://www.jomc.org/jomc-tools/2.0.0-SNAPSHOT" )
    public TestInvoker()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Dependencies]
    // SECTION-END
    // SECTION-START[Properties]
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END

}
