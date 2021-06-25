package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Security
 * 
 * Container for security relevant information of the AAS.
 */

public class DefaultSecurity implements Security {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints")
    protected AccessControlPolicyPoints accessControlPolicyPoints;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/certificate")
    protected List<Certificate> certificates = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension")
    protected List<Reference> requiredCertificateExtensions = new ArrayList<>();

    public DefaultSecurity() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.accessControlPolicyPoints,
            this.certificates,
            this.requiredCertificateExtensions);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultSecurity other = (DefaultSecurity) obj;
            return Objects.equals(this.accessControlPolicyPoints, other.accessControlPolicyPoints) &&
                Objects.equals(this.certificates, other.certificates) &&
                Objects.equals(this.requiredCertificateExtensions, other.requiredCertificateExtensions);
        }
    }

    @Override
    public AccessControlPolicyPoints getAccessControlPolicyPoints() {
        return accessControlPolicyPoints;
    }

    @Override
    public void setAccessControlPolicyPoints(AccessControlPolicyPoints accessControlPolicyPoints) {
        this.accessControlPolicyPoints = accessControlPolicyPoints;
    }

    @Override
    public List<Certificate> getCertificates() {
        return certificates;
    }

    @Override
    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    @Override
    public List<Reference> getRequiredCertificateExtensions() {
        return requiredCertificateExtensions;
    }

    @Override
    public void setRequiredCertificateExtensions(List<Reference> requiredCertificateExtensions) {
        this.requiredCertificateExtensions = requiredCertificateExtensions;
    }

    /**
     * This builder class can be used to construct a DefaultSecurity bean.
     */
    public static class Builder extends SecurityBuilder<DefaultSecurity, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSecurity newBuildingInstance() {
            return new DefaultSecurity();
        }
    }
}
