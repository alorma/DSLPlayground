package org.firezenk.dslplayground

object Shows {
    val shows: MutableList<TvShow> = mutableListOf(
            tvShow {
                id = 1
                name = "Rick and Morty"
                description = "The show revolves around the adventures of the members of the Smith household, which consists of parents Jerry and Beth, their kids Summer and Morty, and Beth's father, Rick Sanchez, who lives with them as a guest. According to Justin Roiland, the family lives outside of Seattle in the U.S. state of Washington.[2] The adventures of Rick and Morty, however, take place across an infinite number of realities, with the characters travelling to other planets and dimensions through portals and Rick's flying car."
                image = "https://upload.wikimedia.org/wikipedia/en/b/b0/Rick_and_Morty_characters.jpg"

                character {
                    id = 1
                    name = "Rick Sanchez"
                    description = "A genius mad scientist who is the father of Beth Smith and the maternal grandfather of Morty"
                    image = "https://upload.wikimedia.org/wikipedia/en/thumb/e/e9/Rick_and_Morty_characters_-_Rick_Sanchez.jpg/110px-Rick_and_Morty_characters_-_Rick_Sanchez.jpg"
                }
                character {
                    id = 2
                    name = "Morty Smith"
                    description = "Rick's 14-year-old grandson who is frequently dragged into Rick's misadventures."
                    image = "https://upload.wikimedia.org/wikipedia/en/thumb/d/d7/Rick_and_Morty_characters_-_Morty_Smith.jpg/110px-Rick_and_Morty_characters_-_Morty_Smith.jpg"
                }
                character {
                    id = 3
                    name = "Beth Smith"
                    description = "Rick's daughter, Summer and Morty's mother, and Jerry's wife."
                    image = "https://upload.wikimedia.org/wikipedia/en/thumb/2/2f/Rick_and_Morty_characters_-_Beth_Smith.jpg/110px-Rick_and_Morty_characters_-_Beth_Smith.jpg"
                }
                character {
                    id = 4
                    name = "Jerry Smith"
                    description = "Summer and Morty's insecure father, Beth's husband, and Rick's son-in-law."
                    image = "https://upload.wikimedia.org/wikipedia/en/thumb/5/54/Rick_and_Morty_characters_-_Jerry_Smith.jpg/110px-Rick_and_Morty_characters_-_Jerry_Smith.jpg"
                }
                character {
                    id = 5
                    name = "Summer Smith"
                    description = "Morty's 17-year-old older sister, a more conventional and often superficial teenager."
                    image = "https://upload.wikimedia.org/wikipedia/en/thumb/e/ee/Rick_and_Morty_characters_-_Summer_Smith.jpg/110px-Rick_and_Morty_characters_-_Summer_Smith.jpg"
                }
            },
            tvShow {
                id = 2
                name = "The Simpsons"
                description = "The Simpsons are a family who live in a fictional \"Middle America\" town of Springfield.[11] Homer, the father, works as a safety inspector at the Springfield Nuclear Power Plant, a position at odds with his careless, buffoonish personality. He is married to Marge, a stereotypical American housewife and mother. They have three children: Bart, a ten-year-old troublemaker; Lisa, a precocious eight-year-old activist; and Maggie, the baby of the family who rarely speaks, but communicates by sucking on a pacifier. Although the family is dysfunctional, many episodes examine their relationships and bonds with each other and they are often shown to care about one another.[12] The family owns a dog, Santa's Little Helper, and a cat, Snowball V, renamed Snowball II in \"I, (Annoyed Grunt)-Bot\".[13] Both pets have had starring roles in several episodes."
                image = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/The_Simpsons_Logo.svg/500px-The_Simpsons_Logo.svg.png"

                character {
                    id = 1
                    name = "Maggie Simpson"
                    description = "Maggie is the youngest child of Homer and Marge, and sister to Bart and Lisa. She is often seen sucking on her red pacifier and, when she walks, she trips over her clothing and falls on her face"
                    image = "https://upload.wikimedia.org/wikipedia/en/9/9d/Maggie_Simpson.png"
                }
                character {
                    id = 2
                    name = "Lisa Simpson"
                    description = "Intelligent, passionate, and the moral center of the family, Lisa Simpson, at eight years old, is the second child of Homer and Marge, younger sister of Bart, and older sister of Maggie. Lisa's high intellect and liberal political stance creates a barrier between her and other children her age, therefore she is a bit of a loner and social outcast."
                    image = "https://upload.wikimedia.org/wikipedia/en/e/ec/Lisa_Simpson.png"
                    character {
                        id = 2
                        name = "Lisax Simpson"
                        description = "Intelligent, passionate, and the moral center of the family, Lisa Simpson, at eight years old, is the second child of Homer and Marge, younger sister of Bart, and older sister of Maggie. Lisa's high intellect and liberal political stance creates a barrier between her and other children her age, therefore she is a bit of a loner and social outcast."
                        image = "https://upload.wikimedia.org/wikipedia/en/e/ec/Lisa_Simpson.png"
                    }
                }
                character {
                    id = 3
                    name = "Bart Simpson"
                    description = "At ten years old, Bart is the eldest child and only son of Homer and Marge, and the brother of Lisa and Maggie. Bart's most prominent and popular character traits are his mischievousness, rebelliousness and disrespect for authority."
                    image = "https://en.wikipedia.org/wiki/File:Bart_Simpson_200px.png"
                }
                character {
                    id = 4
                    name = "Marge Simpson"
                    description = "Marge is the matriarch of the Simpson family. With her husband Homer, she has three children: Bart, Lisa, and Maggie. Marge is the moralistic force in her family and often provides a grounding voice in the midst of her family's antics by trying to maintain order in the Simpson household"
                    image = "https://en.wikipedia.org/wiki/File:Marge_Simpson.png"
                }
                character {
                    id = 5
                    name = "Homer Simpson"
                    description = "As the family's provider, he works at the Springfield Nuclear Power Plant as safety inspector. Homer embodies many American working class stereotypes: he is crude, bald, hot-tempered, obese, rule-neglecting, clumsy, lazy, heavy drinking, ignorant and idiotic; however, he is essentially a decent man and fiercely devoted to his family, often ignoring his own personal interests for those of his family."
                    image = "https://en.wikipedia.org/wiki/File:Homer_Simpson_2006.png"
                }
            }
    )
}