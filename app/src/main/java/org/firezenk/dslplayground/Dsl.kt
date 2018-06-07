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
    val characters: List<TvCharacter> = mutableListOf()


    fun build(): TvShow = TvShow(id, name, description, image, characters)
}

fun tvShow(setup: TvShowBuilder.() -> Unit): TvShow = TvShowBuilder().apply(setup).build()