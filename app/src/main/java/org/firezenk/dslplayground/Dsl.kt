package org.firezenk.dslplayground

@DslMarker
annotation class ShowDsl

@ShowDsl
class TvCharacterBuilder {
    var id: Int = 0
    var name: String = ""
    var description: String = ""
    var image: String = ""

    fun build(): TvCharacter = TvCharacter(id, name, description, image)
}

@ShowDsl
fun character(setup: TvCharacterBuilder.() -> Unit): TvCharacter =
        TvCharacterBuilder().apply(setup).build()

@ShowDsl
class TvShowBuilder {
    var id: Int = 0
    var name: String = ""
    var description: String = ""
    var image: String = ""
    val characters: MutableList<TvCharacter> = mutableListOf()

    fun build(): TvShow = TvShow(id, name, description, image, characters.toList())

    @ShowDsl
    fun character(setup: TvCharacterBuilder.() -> Unit) {
        characters.add(TvCharacterBuilder().apply(setup).build())
    }
}

@ShowDsl
fun tvShow(setup: TvShowBuilder.() -> Unit): TvShow = TvShowBuilder().apply(setup).build()