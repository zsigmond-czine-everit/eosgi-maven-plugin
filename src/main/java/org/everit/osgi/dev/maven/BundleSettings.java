package org.everit.osgi.dev.maven;

/*
 * Copyright (c) 2011, Everit Kft.
 *
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

public class BundleSettings {

    /**
     * The start level of the bundle or if left empty, the framework default startlevel will be used.
     * 
     * @parameter
     */
    private Integer startLevel;

    /**
     * The Bundle-SymbolicName, a required parameter.
     * 
     * @parameter
     */
    private String symbolicName;

    /**
     * The version of the bundle. If left empty, all bundles with the specified symbolic name will be relevant. At the
     * moment only exact values are suppoted, range support may come in a future version if requested by many users.
     * 
     * @parameter
     */
    private String version;

    public Integer getStartLevel() {
        return startLevel;
    }

    public String getSymbolicName() {
        return symbolicName;
    }

    public String getVersion() {
        return version;
    }

    public void setStartLevel(final Integer startLevel) {
        this.startLevel = startLevel;
    }

    public void setSymbolicName(final String symbolicName) {
        this.symbolicName = symbolicName;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "BundleSettings [symbolicName=" + symbolicName + ", version=" + version + ", startLevel=" + startLevel
                + "]";
    }

}