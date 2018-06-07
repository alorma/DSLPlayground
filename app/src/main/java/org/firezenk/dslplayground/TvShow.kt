package org.firezenk.dslplayground

data class TvShow(val id: Int, val name: String, val description: String,
                  val image: String, val casting: List<TvCharacter>)

data class TvCharacter(val id: Int, val name: String, val description: String, val image: String)