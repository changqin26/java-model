package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A key is a reference to an element by its id.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultKey.class)
})
public interface Key {

    /**
     * Type of the key value. In case of idType = idShort local shall be true. In case
     * type=GlobalReference idType shall not be IdShort.
     *
     * Constraint AASd-080: In case Key/type == GlobalReference idType shall not be any LocalKeyType
     * (IdShort, FragmentId).
     *
     * Constraint AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any
     * LocalKeyType (IdShort, FragmentId).
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/idType
     *
     * @return Returns the List of KeyTypes for the property idTypes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/idType")
    List<KeyType> getIdTypes();

    /**
     * Type of the key value. In case of idType = idShort local shall be true. In case
     * type=GlobalReference idType shall not be IdShort.
     *
     * Constraint AASd-080: In case Key/type == GlobalReference idType shall not be any LocalKeyType
     * (IdShort, FragmentId).
     *
     * Constraint AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any
     * LocalKeyType (IdShort, FragmentId).
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/idType
     *
     * @param idTypes desired value for the property idTypes.
     */
    void setIdTypes(List<KeyType> idTypes);

    /**
     * Denote which kind of entity is referenced. In case type = GlobalReference then the element is a
     * global unique id. In all other cases the key references a model element of the same or of another
     * AAS. The name of the model element is explicitly listed.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/type
     *
     * @return Returns the List of KeyElementss for the property types.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/type")
    List<KeyElements> getTypes();

    /**
     * Denote which kind of entity is referenced. In case type = GlobalReference then the element is a
     * global unique id. In all other cases the key references a model element of the same or of another
     * AAS. The name of the model element is explicitly listed.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/type
     *
     * @param types desired value for the property types.
     */
    void setTypes(List<KeyElements> types);

    /**
     * The key value, for example an IRDI if the idType=IRDI.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/value
     *
     * @return Returns the List of Strings for the property values.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/value")
    List<String> getValues();

    /**
     * The key value, for example an IRDI if the idType=IRDI.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/value
     *
     * @param values desired value for the property values.
     */
    void setValues(List<String> values);

}
