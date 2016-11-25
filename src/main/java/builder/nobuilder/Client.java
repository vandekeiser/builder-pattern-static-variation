/*
 * This class forms part of the Design Patterns Course by
 * Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2016, Heinz Kabutz, All rights reserved.
 */

package builder.nobuilder;

import static builder.OrganizationalUnitId.IT_ID;
import static builder.OrganizationalUnitId.RH_ID;
import static builder.OrganizationalUnitId.RH_IT_ID;

public class Client {

    public static void main(String[] args) {
        OrganizationalUnit rhIt = new OrganizationalUnit(
            RH_IT_ID, 
            IT_ID,   //pole 
            RH_ID    //business
        );
    }
    
}
