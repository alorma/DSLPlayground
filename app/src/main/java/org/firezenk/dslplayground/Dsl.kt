package org.firezenk.dslplayground


class TvCharacterBuilder {
    var id: Int = 0
    var name: String = ""
    var description: String = ""
    var image: String = ""

    fun build(): TvCharacter = TvCharacter(id, name, description, image)
}


fun character(setup: TvCharacterBuilder.() -> Unit): TvCharacter =
        TvCharacterBuilder().apply(setup).build()