/**
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.service.resource.recurring;

import java.util.Arrays;
import com.adyen.Service;
import com.adyen.service.Resource;

public class ListRecurringDetails extends Resource {
    public ListRecurringDetails(Service service) {
        super(service,
                service.getClient().getConfig().getEndpoint() + "/pal/servlet/Recurring/" + service.getClient().getApiVersion() + "/listRecurringDetails",
                Arrays.asList(
                        "merchantAccount",
                        "recurring.contract",
                        "shopperReference"
                ));
    }
}
