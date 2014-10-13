/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.io.rest.core.thing.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is a java bean that is used with JAXB to serialize thing lists to XML or
 * JSON.
 * 
 * @author Dennis Nobel - Initial contribution
 *
 */
@XmlRootElement(name = "thingTypes")
public class ThingTypeListBean {

    @XmlElement(name = "thingType")
    public final List<ThingTypeBean> entries = new ArrayList<>();

    public ThingTypeListBean() {
    }

    public ThingTypeListBean(Collection<ThingTypeBean> list) {
        entries.addAll(list);
    }
}