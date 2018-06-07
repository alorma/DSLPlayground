package org.firezenk.dslplayground

@DslMarker
annotation class ShowDsl

@ShowDsl
class CHARACTERS : ArrayList<TvCharacter>() {
    @ShowDsl
    fun character(setup: TvCharacterBuilder.() -> Unit) {
        add(TvCharacterBuilder().apply(setup).build())
    }
}

@ShowDsl
class TvCharacterBuilder {
    var id: Int = 0
    var name: String = ""
    var description: String = ""
    var image: String = ""

    fun build(): TvCharacter = TvCharacter(id, name, description, image)
}

@ShowDsl
class TvShowBuilder {
    var id: Int = 0
    var name: String = ""
    var description: String = ""
    var image: String = ""
    private var characters: List<TvCharacter> = mutableListOf()

    fun build(): TvShow = TvShow(id, name, description, image, characters.toList())

    fun characters(setup: CHARACTERS.() -> Unit) {
        characters = CHARACTERS().apply(setup)
    }
}

@ShowDsl
fun tvShow(setup: TvShowBuilder.() -> Unit): TvShow = TvShowBuilder().apply(setup).build()