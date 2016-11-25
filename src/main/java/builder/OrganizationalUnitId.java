/*
 * This class forms part of the Design Patterns Course by
 * Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2016, Heinz Kabutz, All rights reserved.
 */

package builder;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public final class OrganizationalUnitId {

    public static final OrganizationalUnitId
        IT_ID = new OrganizationalUnitId("123"),
        RH_ID = new OrganizationalUnitId("456"),
        RH_IT_ID = new OrganizationalUnitId("789")
    ;
    
    private final String id;

    public OrganizationalUnitId(String id) {
        this.id = requireNonNull(id);
    }
    
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrganizationalUnitId)) return false;
        OrganizationalUnitId that = (OrganizationalUnitId) o;
        return Objects.equals(this.id, that.id);
    }

    @Override public int hashCode() {
        return Objects.hash(id);
    }
    
}
