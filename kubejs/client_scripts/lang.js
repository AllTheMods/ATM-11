// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
Clientallthemodss.lang('en_us', allthemods => {
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
})
// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
