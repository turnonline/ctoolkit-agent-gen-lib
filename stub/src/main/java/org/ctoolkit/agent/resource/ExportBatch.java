/*
 * Copyright (c) 2017 Comvai, s.r.o. All Rights Reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.ctoolkit.agent.resource;


import org.ctoolkit.agent.model.DataType;
import org.ctoolkit.agent.model.JobState;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Export DTO for rest communication
 *
 * @author <a href="mailto:jozef.pohorelec@ctoolkit.org">Jozef Pohorelec</a>
 */
public class ExportBatch
{
    private Long id;

    private String name;

    private String jobId;

    private Date createDate;

    private Date updateDate;

    private ExportJob jobInfo;

    private List<ExportItem> items = new ArrayList<ExportItem>();

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getJobId()
    {
        return jobId;
    }

    public void setJobId( String jobId )
    {
        this.jobId = jobId;
    }

    public Date getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate( Date createDate )
    {
        this.createDate = createDate;
    }

    public Date getUpdateDate()
    {
        return updateDate;
    }

    public void setUpdateDate( Date updateDate )
    {
        this.updateDate = updateDate;
    }

    public ExportJob getJobInfo()
    {
        return jobInfo;
    }

    public void setJobInfo( ExportJob jobInfo )
    {
        this.jobInfo = jobInfo;
    }

    public List<ExportItem> getItems()
    {
        return items;
    }

    public void setItems( List<ExportItem> items )
    {
        this.items = items;
    }

    public static class ExportItem
    {
        private Long id;

        private String name;

        private byte[] data;

        private String fileName;

        private DataType dataType;

        private long dataLength;

        private JobState state;

        private String entityToExport;

        private Date createDate;

        private Date updateDate;

        private String error;

        public Long getId()
        {
            return id;
        }

        public void setId( Long id )
        {
            this.id = id;
        }

        public String getName()
        {
            return name;
        }

        public void setName( String name )
        {
            this.name = name;
        }

        public byte[] getData()
        {
            return data;
        }

        public void setData( byte[] data )
        {
            this.data = data;
        }

        public String getFileName()
        {
            return fileName;
        }

        public void setFileName( String fileName )
        {
            this.fileName = fileName;
        }

        public DataType getDataType()
        {
            return dataType;
        }

        public void setDataType( DataType dataType )
        {
            this.dataType = dataType;
        }

        public long getDataLength()
        {
            return dataLength;
        }

        public void setDataLength( long dataLength )
        {
            this.dataLength = dataLength;
        }

        public JobState getState()
        {
            return state;
        }

        public void setState( JobState state )
        {
            this.state = state;
        }

        public String getEntityToExport()
        {
            return entityToExport;
        }

        public void setEntityToExport( String entityToExport )
        {
            this.entityToExport = entityToExport;
        }

        public Date getCreateDate()
        {
            return createDate;
        }

        public void setCreateDate( Date createDate )
        {
            this.createDate = createDate;
        }

        public Date getUpdateDate()
        {
            return updateDate;
        }

        public void setUpdateDate( Date updateDate )
        {
            this.updateDate = updateDate;
        }

        public String getError()
        {
            return error;
        }

        public void setError( String error )
        {
            this.error = error;
        }
    }
}
