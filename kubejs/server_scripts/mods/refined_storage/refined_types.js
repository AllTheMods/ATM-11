// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.

ServerEvents.recipes((allthemods) => {
    allthemods.shaped(
        "refinedtypes:64k_energy_storage_part",
        ["abc", "ded", "cfa"],
        {
            a: "refinedstorage:quartz_enriched_copper",
            b: "energizedpower:advanced_circuit",
            c: "refinedstorage:quartz_enriched_iron",
            d: "refinedstorage:advanced_processor",
            e: "energizedpower:battery_6",
            f: "energizedpower:advanced_upgrade_module",
        },
    );

    allthemods.shaped(
        "refinedtypes:network_energizer", 
        ["abc", "ded", "cfg"], 
        {
            a: "refinedstorage:construction_core",
            b: "refinedstorage:interface",
            c: "refinedstorage:advanced_processor",
            d: "energizedpower:advanced_circuit",
            e: "refinedstorage:machine_casing",
            f: "energizedpower:advanced_upgrade_module",
            g: "refinedstorage:destruction_core",
        }
    );

    let parts = [
        {
            num: "64k",
            mod: "advanced",
            wire: "energized_copper_wire",
        },
        {
            num: "256k",
            mod: "advanced",
            wire: "energized_copper_wire",
        },
        {
            num: "1024k",
            mod: "advanced",
            wire: "energized_copper_wire",
        },
        {
            num: "8192k",
            mod: "advanced",
            wire: "energized_copper_wire",
        },
        {
            num: "65536k",
            mod: "reinforced_advanced",
            wire: "energized_gold_wire",
        },
        {
            num: "262144k",
            mod: "reinforced_advanced",
            wire: "energized_gold_wire",
        },
        {
            num: "1048576k",
            mod: "reinforced_advanced",
            wire: "energized_gold_wire",
        },
        {
            num: "8388608k",
            mod: "reinforced_advanced",
            wire: "energized_gold_wire",
        },
    ];

    for (let part of parts) {
        allthemods.shaped(
            `refinedtypes:${part.num}_energy_storage_disk`,
            ["aba", "cdc", "aea"],
            {
                a: `energizedpower:${part.wire}`,
                b: `refinedtypes:${part.num}_energy_storage_part`,
                c: "refinedstorage:advanced_processor",
                d: `energizedpower:${part.mod}_upgrade_module`,
                e: "refinedstorage:storage_housing",
            },
        );

        allthemods.shaped(
            `refinedtypes:${part.num}_energy_storage_block`,
            ["aba", "cdc", "aea"],
            {
                a: `energizedpower:${part.wire}`,
                b: `refinedtypes:${part.num}_energy_storage_part`,
                c: "refinedstorage:advanced_processor",
                d: `energizedpower:${part.mod}_upgrade_module`,
                e: "refinedstorage:machine_casing",
            },
        );
    }

    let partUpgrade = [
        {
            num: "64k",
            out: "256k",
            mod: "advanced",
            cir: "advanced_circuit",
        },
        {
            num: "256k",
            out: "1024k",
            mod: "advanced",
            cir: "advanced_circuit",
        },
        {
            num: "1024k",
            out: "8192k",
            mod: "advanced",
            cir: "advanced_circuit",
        },
        {
            num: "8192k",
            out: "65536k",
            mod: "reinforced_advanced",
            cir: "processing_unit",
        },
        {
            num: "65536k",
            out: "262144k",
            mod: "reinforced_advanced",
            cir: "processing_unit",
        },
        {
            num: "65536k",
            out: "1048576k",
            mod: "reinforced_advanced",
            cir: "processing_unit",
        },
        {
            num: "1048576k",
            out: "8388608k",
            mod: "reinforced_advanced",
            cir: "processing_unit",
        },
    ];

    for (let up of partUpgrade) {
        allthemods.shaped(
            `refinedtypes:${up.out}_energy_storage_part`,
            ["abc", "bdb", "cba"],
            {
                a: "refinedstorage:advanced_processor",
                b: `refinedtypes:${up.num}_energy_storage_part`,
                c: `energizedpower:${up.cir}`,
                d: `energizedpower:${up.mod}_upgrade_module`,
            },
        );
    }

    function meteoricInfusion(id, time, input, catalysts, output) {
        allthemods
            .custom({
                type: "occultism:ritual",
                activation_item: input,
                duration: time,
                ingredients: catalysts,
                pentacle_id: "occultism:meteoric_infusion",
                result: {
                    id: output,
                },
                ritual_dummy: {
                    id: "occultism:ritual_dummy/meteoric_infusion",
                },
                ritual_type: "occultism:craft",
            })
            .id(`allthemods:meteoric_infusion/${id}`);
    }

    meteoricInfusion(
        "inf_part",
        20,
        "energizedpower:elite_upgrade_module",
        [
            "refinedtypes:8388608k_energy_storage_part",
            "refinedtypes:8388608k_energy_storage_part",
            "refinedtypes:8388608k_energy_storage_part",
            "refinedtypes:8388608k_energy_storage_part",
            "cabletiers:mega_interface",
            "cabletiers:mega_interface",
            "energizedpower:quantum_processing_unit",
            "energizedpower:quantum_processing_unit",
            "refinedtypes:8388608k_energy_storage_part",
            "refinedtypes:8388608k_energy_storage_part",
            "refinedtypes:8388608k_energy_storage_part",
            "refinedtypes:8388608k_energy_storage_part",
        ],
        "refinedtypes:infinite_energy_storage_part",
    );

    meteoricInfusion(
        "inf_disk",
        20,
        "refinedstorage:storage_housing",
        [
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
            "energizedpower:superconductor",
            "energizedpower:superconductor",
            "energizedpower:quantum_processing_unit",
            "energizedpower:quantum_processing_unit",
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
        ],
        "refinedtypes:infinite_energy_storage_disk",
    );

    meteoricInfusion(
        "inf_block",
        20,
        "refinedstorage:machine_casing",
        [
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
            "energizedpower:superconductor",
            "energizedpower:superconductor",
            "energizedpower:quantum_processing_unit",
            "energizedpower:quantum_processing_unit",
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
            "refinedtypes:infinite_energy_storage_part",
        ],
        "refinedtypes:infinite_energy_storage_block",
    );

    //Removal

    let typeNum = [
        "64k",
        "256k",
        "1024k",
        "8192k",
        "65536k",
        "262144k",
        "1048576k",
        "8388608k",
    ];

    for (let num of typeNum) {
        allthemods.remove([
            { id: `refinedtypes:${num}_energy_storage_part` },
            { id: `refinedtypes:${num}_energy_storage_disk` },
            { id: `refinedtypes:${num}_energy_storage_block` },
            { id: `refinedtypes:${num}_energy_storage_disk_from_storage_housing` },
            { id: `refinedtypes:${num}_energy_storage_disk_upgrade` },
            { id: `refinedtypes:${num}_energy_storage_block_upgrade` },
        ]);
    }

    allthemods.remove([
        { id: "refinedtypes:network_energizer" },
        { id: "refinedtypes:infinite_energy_storage_disk" },
        { id: "refinedtypes:infinite_energy_storage_block" },
        { id: "refinedtypes:infinite_energy_storage_disk_from_storage_housing" },
    ]);
});

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
