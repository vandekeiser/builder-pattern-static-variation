/*
 * This class forms part of the Design Patterns Course by
 * Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2016, Heinz Kabutz, All rights reserved.
 */

package builder.staticbuilder;

import builder.OrganizationalUnitId;

import java.util.Objects;

class OrganizationalUnit {
    
    private final OrganizationalUnitId id, poleId, businessId;

    private OrganizationalUnit(
            OrganizationalUnitId id, 
            OrganizationalUnitId poleId, 
            OrganizationalUnitId businessId) {
        this.id = Objects.requireNonNull(id);
        this.poleId = poleId;
        this.businessId = businessId;
    }
    
    
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrganizationalUnit)) return false;
        OrganizationalUnit that = (OrganizationalUnit) o;
        return Objects.equals(this.id, that.id);
    }

    @Override public int hashCode() {
        return Objects.hash(id);
    }

    public static Builder identifiedBy(OrganizationalUnitId id) {
        return new Builder(id);
    }

    public static class Builder {
        private OrganizationalUnitId id;
        private OrganizationalUnitId poleId;
        private OrganizationalUnitId businessId;

        public Builder(OrganizationalUnitId id) {
            this.id = id;
        }

        public Builder attachedToPole(OrganizationalUnitId poleId) {
            this.poleId = poleId;
            return this;
        }

        public OrganizationalUnit attachedToBusiness(OrganizationalUnitId businessId) {
            return new OrganizationalUnit(
                id, poleId, businessId
            );
        }

    }
}
