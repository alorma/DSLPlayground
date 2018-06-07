package org.firezenk.dslplayground

object Shows {

    private val characteresRickMorty = mutableListOf(
            TvCharacter(1, "Rick Sanchez",
                    "A genius mad scientist who is the father of Beth Smith and the maternal grandfather of Morty",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/e/e9/Rick_and_Morty_characters_-_Rick_Sanchez.jpg/110px-Rick_and_Morty_characters_-_Rick_Sanchez.jpg"),
            TvCharacter(2, "Morty Smith",
                    "Rick's 14-year-old grandson who is frequently dragged into Rick's misadventures.",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/d/d7/Rick_and_Morty_characters_-_Morty_Smith.jpg/110px-Rick_and_Morty_characters_-_Morty_Smith.jpg"),
            TvCharacter(3, "Beth Smith",
                    "Rick's daughter, Summer and Morty's mother, and Jerry's wife.",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/2/2f/Rick_and_Morty_characters_-_Beth_Smith.jpg/110px-Rick_and_Morty_characters_-_Beth_Smith.jpg"),
            TvCharacter(4, "Jerry Smith",
                    "Summer and Morty's insecure father, Beth's husband, and Rick's son-in-law.",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/5/54/Rick_and_Morty_characters_-_Jerry_Smith.jpg/110px-Rick_and_Morty_characters_-_Jerry_Smith.jpg"),
            TvCharacter(5, "Summer Smith",
                    "Morty's 17-year-old older sister, a more conventional and often superficial teenager.",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/e/ee/Rick_and_Morty_characters_-_Summer_Smith.jpg/110px-Rick_and_Morty_characters_-_Summer_Smith.jpg")
    )

    private val characteresSimpson = mutableListOf(
            TvCharacter(1, "Maggie Simpson",
                    "Maggie is the youngest child of Homer and Marge, and sister to Bart and Lisa. She is often seen sucking on her red pacifier and, when she walks, she trips over her clothing and falls on her face",
                    "https://upload.wikimedia.org/wikipedia/en/9/9d/Maggie_Simpson.png"),
            TvCharacter(2, "Lisa Simpson",
                    "Intelligent, passionate, and the moral center of the family, Lisa Simpson, at eight years old, is the second child of Homer and Marge, younger sister of Bart, and older sister of Maggie. Lisa's high intellect and liberal political stance creates a barrier between her and other children her age, therefore she is a bit of a loner and social outcast.",
                    "https://upload.wikimedia.org/wikipedia/en/e/ec/Lisa_Simpson.png"),
            TvCharacter(3, "Bart Simpson",
                    "At ten years old, Bart is the eldest child and only son of Homer and Marge, and the brother of Lisa and Maggie. Bart's most prominent and popular character traits are his mischievousness, rebelliousness and disrespect for authority.",
                    "https://en.wikipedia.org/wiki/File:Bart_Simpson_200px.png"),
            TvCharacter(3, "Marge Simpson",
                    "Marge is the matriarch of the Simpson family. With her husband Homer, she has three children: Bart, Lisa, and Maggie. Marge is the moralistic force in her family and often provides a grounding voice in the midst of her family's antics by trying to maintain order in the Simpson household",
                    "https://en.wikipedia.org/wiki/File:Marge_Simpson.png"),
            TvCharacter(3, "Homer Simpson",
                    "As the family's provider, he works at the Springfield Nuclear Power Plant as safety inspector. Homer embodies many American working class stereotypes: he is crude, bald, hot-tempered, obese, rule-neglecting, clumsy, lazy, heavy drinking, ignorant and idiotic; however, he is essentially a decent man and fiercely devoted to his family, often ignoring his own personal interests for those of his family.",
                    "https://en.wikipedia.org/wiki/File:Homer_Simpson_2006.png")
    )

    val shows: MutableList<TvShow> = mutableListOf(
            TvShow(1, "Rick and Morty",
                    "The show revolves around the adventures of the members of the Smith household, which consists of parents Jerry and Beth, their kids Summer and Morty, and Beth's father, Rick Sanchez, who lives with them as a guest. According to Justin Roiland, the family lives outside of Seattle in the U.S. state of Washington.[2] The adventures of Rick and Morty, however, take place across an infinite number of realities, with the characters travelling to other planets and dimensions through portals and Rick's flying car.",
                    "https://upload.wikimedia.org/wikipedia/en/b/b0/Rick_and_Morty_characters.jpg", characteresRickMorty),
            TvShow(2, "The Simpsons",
                    "The Simpsons are a family who live in a fictional \"Middle America\" town of Springfield.[11] Homer, the father, works as a safety inspector at the Springfield Nuclear Power Plant, a position at odds with his careless, buffoonish personality. He is married to Marge, a stereotypical American housewife and mother. They have three children: Bart, a ten-year-old troublemaker; Lisa, a precocious eight-year-old activist; and Maggie, the baby of the family who rarely speaks, but communicates by sucking on a pacifier. Although the family is dysfunctional, many episodes examine their relationships and bonds with each other and they are often shown to care about one another.[12] The family owns a dog, Santa's Little Helper, and a cat, Snowball V, renamed Snowball II in \"I, (Annoyed Grunt)-Bot\".[13] Both pets have had starring roles in several episodes.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/The_Simpsons_Logo.svg/500px-The_Simpsons_Logo.svg.png", characteresSimpson)
    )
}