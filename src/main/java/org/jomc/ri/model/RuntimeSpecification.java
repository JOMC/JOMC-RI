// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 * Java Object Management and Configuration
 * Copyright (C) Christian Schulte <cs@schulte.it>, 2011-313
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
package org.jomc.ri.model;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.xml.bind.annotation.XmlTransient;
import org.jomc.model.ModelObjectException;
import org.jomc.model.Specification;
import org.jomc.jls.JavaTypeName;
import static org.jomc.ri.model.RuntimeModelObjects.BOOTSTRAP_CLASSLOADER_KEY;
import static org.jomc.ri.model.RuntimeModelObjects.classesByClassLoaderAndNameCache;
import static org.jomc.ri.model.RuntimeModelObjects.createMap;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Runtime {@code Specification}.
 *
 * <dl>
 *   <dt><b>Identifier:</b></dt><dd>org.jomc.ri.model.RuntimeSpecification</dd>
 *   <dt><b>Name:</b></dt><dd>JOMC ⁑ RI ⁑ RuntimeSpecification</dd>
 *   <dt><b>Specifications:</b></dt>
 *     <dd>org.jomc.ri.model.RuntimeModelObject @ 1.2</dd>
 *   <dt><b>Abstract:</b></dt><dd>No</dd>
 *   <dt><b>Final:</b></dt><dd>No</dd>
 *   <dt><b>Stateless:</b></dt><dd>No</dd>
 * </dl>
 *
 * @author <a href="mailto:cs@schulte.it">Christian Schulte</a> 1.2
 * @version 1.2
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 2.0.0-SNAPSHOT", comments = "See http://www.jomc.org/jomc-tools/2.0.0-SNAPSHOT" )
// </editor-fold>
// SECTION-END
public class RuntimeSpecification extends Specification implements RuntimeModelObject
{
    // SECTION-START[RuntimeSpecification]

    /**
     * Java type name.
     */
    @XmlTransient
    private volatile JavaTypeName javaTypeName;

    /**
     * Creates a new {@code RuntimeSpecification} instance by deeply copying a given {@code Specification} instance.
     *
     * @param specification The instance to copy.
     *
     * @throws NullPointerException if {@code specification} is {@code null}.
     */
    public RuntimeSpecification( final Specification specification )
    {
        super( specification );

        if ( this.getAuthors() != null )
        {
            this.setAuthors( RuntimeModelObjects.getInstance().copyOf( this.getAuthors() ) );
        }
        if ( this.getDocumentation() != null )
        {
            this.setDocumentation( RuntimeModelObjects.getInstance().copyOf( this.getDocumentation() ) );
        }
        if ( this.getProperties() != null )
        {
            this.setProperties( RuntimeModelObjects.getInstance().copyOf( this.getProperties() ) );
        }
    }

    /**
     * Gets the Java class of the specification for a given class loader.
     * <p>
     * This method queries an internal cache for a result object to return for the given argument values. If no
     * cached result object is available, this method queries the super-class for a result object to return and caches
     * the outcome of that query for use on successive calls.
     * </p>
     * <p>
     * <b>Note:</b><br/>Method {@code RuntimeModelObjects.clear()} must be used to synchronize the state of the
     * internal cache with the state of the class loader, should the state of the class loader change.
     * </p>
     *
     * @param classLoader The class loader to get the Java class from or {@code null}, to get the Java class from the
     * platform's bootstrap class loader.
     *
     * @return The Java class of the specification or {@code null}, if the specification does not declare a class.
     *
     * @throws ClassNotFoundException if the Java class is not found.
     * @throws ModelObjectException if parsing the name of the referenced type fails.
     *
     * @see #getClazz()
     * @see RuntimeModelObjects#clear()
     */
    @Override
    public Class<?> getJavaClass( final ClassLoader classLoader )
        throws ModelObjectException, ClassNotFoundException
    {
        Class<?> javaClass = null;

        if ( this.getJavaTypeName() != null )
        {
            synchronized ( classesByClassLoaderAndNameCache )
            {
                ClassLoader classLoaderKey = classLoader;
                if ( classLoaderKey == null )
                {
                    classLoaderKey = BOOTSTRAP_CLASSLOADER_KEY;
                }

                Map<String, Reference<Class<?>>> map = classesByClassLoaderAndNameCache.get( classLoaderKey );

                if ( map == null )
                {
                    map = createMap();
                    classesByClassLoaderAndNameCache.put( classLoaderKey, map );
                }

                final Reference<Class<?>> reference = map.get( this.getJavaTypeName().getClassName() );

                if ( reference != null )
                {
                    javaClass = reference.get();
                }

                if ( javaClass == null )
                {
                    javaClass = super.getJavaClass( classLoader );
                    map.put( this.getJavaTypeName().getClassName(), new WeakReference<Class<?>>( javaClass ) );
                }
            }
        }

        return javaClass;
    }

    /**
     * Gets the Java type name of the type referenced by the specification.
     * <p>
     * This method queries an internal cache for a result object to return. If no cached result object is available,
     * this method queries the super-class for a result object to return and caches the outcome of that query for use on
     * successive calls.
     * </p>
     * <p>
     * <b>Note:</b><br/>Method {@code clear()} must be used to synchronize the state of the internal cache with the
     * state of the instance, should the state of the instance change.
     * </p>
     *
     * @return The Java type name of the type referenced by the specification or {@code null}, if the specification does
     * not reference a type.
     *
     * @throws ModelObjectException if compiling the name of the referenced type to a {@code JavaTypeName} fails.
     *
     * @since 1.4
     *
     * @see #getJavaTypeName()
     * @see #clear()
     */
    @Override
    public JavaTypeName getJavaTypeName() throws ModelObjectException
    {
        if ( this.javaTypeName == null )
        {
            this.javaTypeName = super.getJavaTypeName();
        }

        return this.javaTypeName;
    }

    // SECTION-END
    // SECTION-START[RuntimeModelObject]
    public void gc()
    {
        this.gcOrClear( true, false );
    }

    public void clear()
    {
        this.javaTypeName = null;
        this.gcOrClear( false, true );
    }

    private void gcOrClear( final boolean gc, final boolean clear )
    {
        if ( this.getAuthors() instanceof RuntimeModelObject )
        {
            if ( gc )
            {
                ( (RuntimeModelObject) this.getAuthors() ).gc();
            }
            if ( clear )
            {
                ( (RuntimeModelObject) this.getAuthors() ).clear();
            }
        }
        if ( this.getDocumentation() instanceof RuntimeModelObject )
        {
            if ( gc )
            {
                ( (RuntimeModelObject) this.getDocumentation() ).gc();
            }
            if ( clear )
            {
                ( (RuntimeModelObject) this.getDocumentation() ).clear();
            }
        }
        if ( this.getProperties() instanceof RuntimeModelObject )
        {
            if ( gc )
            {
                ( (RuntimeModelObject) this.getProperties() ).gc();
            }
            if ( clear )
            {
                ( (RuntimeModelObject) this.getProperties() ).clear();
            }
        }
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">
    /** Creates a new {@code RuntimeSpecification} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 2.0.0-SNAPSHOT", comments = "See http://www.jomc.org/jomc-tools/2.0.0-SNAPSHOT" )
    public RuntimeSpecification()
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
