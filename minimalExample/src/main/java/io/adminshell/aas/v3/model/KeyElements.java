package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration of different key value types within a key. Contains KeyElements, ReferableElements,
 * and IdentifiableElements.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultKeyElements.class)
})
public interface KeyElements {

}
