// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
ClientEvents.lang('en_us', allthemods => {
    let georeMats = [
        {
            low: 'copper',
            cap: 'Copper'
        },
        {
            low: 'iron',
            cap: 'Iron'
        },
        {
            low: 'tin',
            cap: 'Tin'
        },
        {
            low: 'gold',
            cap: 'Gold'
        },
        {
            low: 'nickel',
            cap: 'Nickel'
        },
        {
            low: 'coal',
            cap: 'Coal'
        },
        {
            low: 'zinc',
            cap: 'Zinc'
        },
        {
            low: 'lead',
            cap: 'Lead'
        },
        {
            low: 'silver',
            cap: 'Silver'
        },
        {
            low: 'redstone',
            cap: 'Redstonr'
        },
        {
            low: 'lapis',
            cap: 'Lapis'
        },
        {
            low: 'osmium',
            cap: 'Osmium'
        },
        {
            low: 'quartz',
            cap: 'Quartz'
        },
        {
            low: 'aluminum',
            cap: 'Aluminium'
        },
        {
            low: 'uraninite',
            cap: 'Uraninite'
        },
        {
            low: 'platinum',
            cap: 'Platinum'
        },
        {
            low: 'diamond',
            cap: 'Diamond'
        },
        {
            low: 'emerald',
            cap: 'Emerald'
        },
        {
            low: 'ancient_debris',
            cap: 'Ancient Debris'
        },
        {
            low: 'allthemodium',
            cap: 'Allthemodium'
        },
        {
            low: 'vibranium',
            cap: 'Vibranium'
        },
        {
            low: 'unobtainium',
            cap: 'Unobtainium'
        }
    ]

    for (let mat of georeMats) {
        allthemods.add(`ritual.occultism.${mat.low}_catalyst.started`, `${mat.cap} Catalyst Ritual Started`)
        allthemods.add(`ritual.occultism.${mat.low}_catalyst.finished`, `${mat.cap} Catalyst Ritual Finished`)
        allthemods.add(`ritual.occultism.${mat.low}_catalyst.interrupted`, `${mat.cap} Catalyst Ritual Interrupted`)
        allthemods.add(`ritual.occultism.${mat.low}_transmutation.started`, `${mat.cap} Transmutation Ritual Started`)
        allthemods.add(`ritual.occultism.${mat.low}_transmutation.finished`, `${mat.cap} Transmutation Ritual Finished`)
        allthemods.add(`ritual.occultism.${mat.low}_transmutation.interrupted`, `${mat.cap} Transmutation Ritual Interrupted`)
    }

    let appflux = [
    /*
        {
            key: '',
            text: ''
        }
    */
        {
            key: 'flux_housing',
            text: 'Flux Cell Housing'
        },
        {
            key: '1k_flux_component',
            text: '1k ME Flux Component'
        },
        {
            key: '4k_flux_component',
            text: '4k ME Flux Component'
        },
        {
            key: '16k_flux_component',
            text: '16k ME Flux Component'
        },
        {
            key: '64k_flux_component',
            text: '64k ME Flux Component'
        },
        {
            key: '256k_flux_component',
            text: '256k ME Flux Component'
        },
        {
            key: '1k_flux_cell',
            text: '1k ME FE Storage Cell'
        },
        {
            key: '4k_flux_cell',
            text: '4k ME FE Storage Cell'
        },
        {
            key: '16k_flux_cell',
            text: '16k ME FE Storage Cell'
        },
        {
            key: '64k_flux_cell',
            text: '64k ME FE Storage Cell'
        },
        {
            key: '256k_flux_cell',
            text: '256k ME FE Storage Cell'
        },
        {
            key: '1k_flux_portable',
            text: '1k Portable FE Cell'
        },
        {
            key: '4k_flux_portable',
            text: '4k Portable FE Cell'
        },
        {
            key: '16k_flux_portable',
            text: '16k Portable FE Cell'
        },
        {
            key: '64k_flux_portable',
            text: '64k Portable FE Cell'
        },
        {
            key: '256k_flux_portable',
            text: '256k Portable FE Cell'
        },
        {
            key: 'crystalline_wand',
            text: 'Crystalline Resonance Wand'
        },
        {
            key: 'inf_part',
            text: 'Infinite Energy Storage Part'
        },
        {
            key: 'inf_disk',
            text: 'Infinite Energy Storage Disk'
        },
        {
            key: 'inf_block',
            text: 'Infinite Energy Storage Block'
        }
    ]

    for (let flux of appflux) {
        allthemods.add(`ritual.allthemods.${flux.key}.started`, `${flux.text} Ritual Started`)
        allthemods.add(`ritual.allthemods.${flux.key}.finished`, `${flux.text} Ritual Finished`)
        allthemods.add(`ritual.allthemods.${flux.key}.interrupted`, `${flux.text} Ritual Interrupted`)
    }

    allthemods.add('multiblock.occultism.meteoric_infusion', 'Meteoric Infusion Altar')
    allthemods.add('book.occultism.dictionary_of_spirits.pentacles.meteoric_infusion.name', 'Meteoric Infusion Altar')
    allthemods.add('book.occultism.dictionary_of_spirits.pentacles.meteoric_infusion.intro.title', 'Meteoric Infusion Altar')
    allthemods.add('book.occultism.dictionary_of_spirits.pentacles.meteoric_infusion.description', 'Meteoric Infusion')
    allthemods.add('book.occultism.dictionary_of_spirits.pentacles.meteoric_infusion.intro.text', 'Within the mysteries of the Mysterious Cube records of the Meteoric Infusion Altar were descovered. The Meteoric Infusion Altar allows for the infusion of items with the mystic energies found within the Mysterious Cube.')
})
// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
