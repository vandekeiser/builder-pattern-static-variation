/*
 * This class forms part of the Design Patterns Course by
 * Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2016, Heinz Kabutz, All rights reserved.
 */

package builder.classicbuilder;

import static builder.OrganizationalUnitId.*;

public class Client {

    public static void main(String[] args) {
        OrganizationalUnit rhIt = new OrganizationalUnit.Builder()
            .identifiedBy(RH_IT_ID)
            .attachedToPole(IT_ID)
            .attachedToBusiness(RH_ID)
            .build()    
        ;
    }
    
}
