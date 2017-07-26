package org.ctoolkit.agent.model;

/**
 * @author <a href="mailto:pohorelec@comvai.com">Jozef Pohorelec</a>
 */
public enum DataType
{
    XML( "application/xml" ),
    JSON( "application/json" );

    private String mimeType;

    DataType( String mimeType )
    {
        this.mimeType = mimeType;
    }

    public String mimeType()
    {
        return mimeType;
    }
}