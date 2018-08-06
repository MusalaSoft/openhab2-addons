/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.energenie.internal.api.manager;

import org.openhab.binding.energenie.internal.api.JsonGateway;
import org.openhab.binding.energenie.internal.api.JsonSubdevice;

/**
 * A helper class for executing requests to the Mi|Home REST API.
 * For more information see {@link https://mihome4u.co.uk/docs/api-documentation}
 *
 * @author Svilen Valkanov - Initial contribution and API
 * @author Dimitar Ivanov - Initial contribution and API
 *
 */
public interface EnergenieApiManager {

    /**
     * This method returns the {@link EnergenieApiConfiguration} (consisting of user and password) which is
     * needed for making the HTTP requests
     *
     * @return the configuration associated with the EnergenieApiManager
     */
    public EnergenieApiConfiguration getConfiguration();

    /**
     * This method lists all gateway devices in your account.
     *
     * @return all gateway devices in the account, along with information about available firmware
     *         upgrades
     */
    public JsonGateway[] listGateways();

    /**
     * This method lists all subdevices in your account, along with information, basic status and usage information.
     *
     * @return all subdevices, properties may vary between objects depending on their type
     */
    public JsonSubdevice[] listSubdevices();

    /**
     * This method will show information about a particular subdevice.
     *
     * @param id the ID of the subdevice
     * @return the subdevice
     */
    public JsonSubdevice showSubdeviceInfo(int id);

    /**
     * This method will show information about firmware version
     *
     * @param id the ID of the gateway
     *
     */
    public String getFirmwareInformation(int id);

}
