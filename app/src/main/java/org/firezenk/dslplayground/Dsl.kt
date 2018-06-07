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

class TvShowBuilder {
    var id: Int = 0
    var name: String = ""
    var description: String = ""
    var image: String = ""
    val characters: MutableList<TvCharacter> = mutableListOf()


    fun build(): TvShow = TvShow(id, name, description, image, characters.toList())

    fun character(character: TvCharacter) {
        characters.add(character)
    }

    fun character(setup: TvCharacterBuilder.() -> Unit) {
        characters.add(TvCharacterBuilder().apply(setup).build())
    }
}

fun tvShow(setup: TvShowBuilder.() -> Unit): TvShow = TvShowBuilder().apply(setup).build()