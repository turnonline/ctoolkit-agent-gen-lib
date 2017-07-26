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

package org.ctoolkit.agent.rest;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiReference;
import com.google.api.server.spi.config.DefaultValue;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import org.ctoolkit.agent.resource.MigrationBatch;
import org.ctoolkit.agent.resource.MigrationJob;

import java.util.List;

/**
 * Endpoint for migration
 *
 * @author <a href="mailto:jozef.pohorelec@ctoolkit.org">Jozef Pohorelec</a>
 */
@Api
@ApiReference( AgentEndpointConfig.class )
public class MigrationEndpoint
{
    // -- migration CRUD

    @ApiMethod( name = "migrationBatch.insert", path = "migration", httpMethod = ApiMethod.HttpMethod.POST )
    public MigrationBatch insertMigration( MigrationBatch migrationBatch )
    {
        return null;
    }

    @ApiMethod( name = "migrationBatch.update", path = "migration/{id}", httpMethod = ApiMethod.HttpMethod.PUT )
    public MigrationBatch updateMigration( @Named( "id" ) Long id, MigrationBatch migrationBatch ) throws Exception
    {
        return null;
    }

    @ApiMethod( name = "migrationBatch.delete", path = "migration/{id}", httpMethod = ApiMethod.HttpMethod.DELETE )
    public void deleteMigration( @Named( "id" ) Long id ) throws Exception
    {
    }

    @ApiMethod( name = "migrationBatch.get", path = "migration/{id}", httpMethod = ApiMethod.HttpMethod.GET )
    public MigrationBatch getMigration( @Named( "id" ) Long id ) throws Exception
    {
        return null;
    }

    @ApiMethod( name = "migrationBatch.list", path = "migration", httpMethod = ApiMethod.HttpMethod.GET )
    @SuppressWarnings( "unchecked" )
    public List<MigrationBatch> listMigration( @DefaultValue( "0" ) @Nullable @Named( "start" ) Integer start,
                                               @DefaultValue( "10" ) @Nullable @Named( "length" ) Integer length,
                                               @Nullable @Named( "orderBy" ) String orderBy,
                                               @DefaultValue( "true" ) @Nullable @Named( "ascending" ) Boolean ascending )
            throws Exception
    {
        return null;
    }

    // -- migration item CRUD

    @ApiMethod( name = "migrationBatch.item.insert", path = "migration/{metadataId}/item", httpMethod = ApiMethod.HttpMethod.POST )
    public MigrationBatch.MigrationItem insertMigrationItem( @Named( "metadataId" ) Long metadataId, MigrationBatch.MigrationItem migrationBatchItem )
    {
        return null;
    }

    @ApiMethod( name = "migrationBatch.item.update", path = "migration/{metadataId}/item/{id}", httpMethod = ApiMethod.HttpMethod.PUT )
    public MigrationBatch.MigrationItem updateMigrationItem( @Named( "metadataId" ) Long metadataId, @Named( "id" ) Long id, MigrationBatch.MigrationItem migrationBatchItem )
            throws Exception
    {
        return null;
    }

    @ApiMethod( name = "migrationBatch.item.delete", path = "migration/{metadataId}/item/{id}", httpMethod = ApiMethod.HttpMethod.DELETE )
    public void deleteMigrationItem( @Named( "metadataId" ) Long metadataId, @Named( "id" ) Long id )
            throws Exception
    {
    }

    @ApiMethod( name = "migrationBatch.item.get", path = "migration/{metadataId}/item/{id}", httpMethod = ApiMethod.HttpMethod.GET )
    public MigrationBatch.MigrationItem getMigrationItem( @Named( "metadataId" ) Long metadataId, @Named( "id" ) Long id )
            throws Exception
    {
        return null;
    }

    // -- job CRUD

    @ApiMethod( name = "migrationBatch.job.start", path = "migration/{id}/job", httpMethod = ApiMethod.HttpMethod.POST )
    public MigrationJob startMigrationJob( @Named( "id" ) Long id ) throws Exception
    {
        return null;
    }

    @ApiMethod( name = "migrationBatch.job.cancel", path = "migration/{id}/job", httpMethod = ApiMethod.HttpMethod.DELETE )
    public void cancelMigrationJob( @Named( "id" ) Long id ) throws Exception
    {
    }

    @ApiMethod( name = "migrationBatch.job.progress", path = "migration/{id}/job", httpMethod = ApiMethod.HttpMethod.GET )
    public MigrationJob getMigrationJob( @Named( "id" ) Long id ) throws Exception
    {
        return null;
    }
}
