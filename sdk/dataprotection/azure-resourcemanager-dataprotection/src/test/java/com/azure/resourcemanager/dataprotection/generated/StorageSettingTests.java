// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.StorageSetting;
import com.azure.resourcemanager.dataprotection.models.StorageSettingStoreTypes;
import com.azure.resourcemanager.dataprotection.models.StorageSettingTypes;
import org.junit.jupiter.api.Assertions;

public final class StorageSettingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageSetting model =
            BinaryData
                .fromString("{\"datastoreType\":\"ArchiveStore\",\"type\":\"LocallyRedundant\"}")
                .toObject(StorageSetting.class);
        Assertions.assertEquals(StorageSettingStoreTypes.ARCHIVE_STORE, model.datastoreType());
        Assertions.assertEquals(StorageSettingTypes.LOCALLY_REDUNDANT, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageSetting model =
            new StorageSetting()
                .withDatastoreType(StorageSettingStoreTypes.ARCHIVE_STORE)
                .withType(StorageSettingTypes.LOCALLY_REDUNDANT);
        model = BinaryData.fromObject(model).toObject(StorageSetting.class);
        Assertions.assertEquals(StorageSettingStoreTypes.ARCHIVE_STORE, model.datastoreType());
        Assertions.assertEquals(StorageSettingTypes.LOCALLY_REDUNDANT, model.type());
    }
}
