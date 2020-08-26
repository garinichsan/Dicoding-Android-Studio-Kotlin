package com.dicoding.mymangalist

object MangaData {
    private val mangaNames = arrayOf(
        "Apotheosis",
        "Dungeon Reset",
        "Hunter x Hunter",
        "Omniscient Reader's Overview",
        "One Piece",
        "Re:Monster",
        "A Returner's Magic Should Be Special",
        "Skeleton Soldier Can't Protect The Dungeon",
        "Solo Leveling",
        "Sorcerer King",
        "Tales of Demons and Gods",
        "Tower Of God"
    )

    private val mangaDetails = arrayOf(
        """Zen Luo, who is now a menial slave, used to be a young master of a big family, owing to the decline of his family, his sister is imprisoned by a strong force, he has no choice but to be at others’ service. However, Every cloud has a silver lining, The ancient book left by his father actually conceals the magical spell, which can change a human into an instrument! What’s the mysterious power behind all these? This is contest with fate.""",
        """Dawoon's ordinary life is turned upside down when he is summoned into the Dungeon, where he must play a deadly game, outlasting dangerous monsters and life-threatening traps. To make matters worse, he's only a mere crafter with zero combat abilities. But after Dawoon falls into a trap and survives after a glitched reset, he's gained random but oddly helpful skills. He'll need to get creative to clear the game and return home, with a bloodthirsty assistant and an adorable ground squirrel along for the ride. Now that the rules no longer apply to him, what possibilities await in the tunnels below?""",
        """Hunters are a special breed, dedicated to tracking down treasures, magical beasts, and even other men. But such pursuits require a license, and less than one in a hundred thousand can pass the grueling qualification exam. Those who do pass gain access to restricted areas, amazing stores of information, and the right to call themselves Hunters. """,
        """Only I know the end of this world.
One day our MC finds himself stuck in the world of his favorite webnovel. What does he do to survive? It is a world struck by catastrophe and danger all around.
His edge? He knows the plot of the story to end. Because he was the sole reader that stuck with it. Read his story to see how he survives!""",
        """As a child, Monkey D. Luffy was inspired to become a pirate by listening to the tales of the buccaneer "Red-Haired" Shanks. But his life changed when Luffy accidentally ate the Gum-Gum Devil Fruit and gained the power to stretch like rubber...at the cost of never being able to swim again! Years later, still vowing to become the king of the pirates, Luffy sets out on his adventure...one guy alone in a rowboat, in search of the legendary "One Piece," said to be the greatest treasure in the world...""",
        """Tomokui Kanata has been re-incarnated in the weakest goblin, named Goburou, after having undergone an unfortunate death. However Goburou has retained his previous life's memories, an unusual evolution, as well as becoming strong enough to gain status boosts from eating. In this alternate world of survival of the fittest, events unfold with competent subordinates and comrades, delightful case of the tail-wagging dog...""",
        """"Now that I'm back, I won't allow my loved ones to die again!"
The Shadow Labyrinth - the deadliest catastrophe humanity has ever known. Desir Arman, one of the six remaining survivors of mankind, is inside the Labyrinth. The six of them attempt to clear the final level of the Labyrinth but ultimately fail, and the world comes to an end. However, when Desir thought he would meet his demise, what appears before him is the world... thirteen years ago?!

Desir is returned to the past, back to the time when he enrolled at the nation's finest magic academy, Havrion. He is reunited with his precious friends, and he is determined to change the past to save the world and his loved ones...!

Three years remain before the emergence of the Shadow World! Change the past and gather powerful comrades to save mankind!""",
        """His only purpose was to protect his master. And yet he was powerless to protect her. But fate has more in store for him as he gets another chance to protect his master once more and change his destiny.""",
        """"In a world where awakened beings called “Hunters” must battle deadly monsters to protect humanity, Sung Jinwoo, nicknamed “the weakest hunter of all mankind,” finds himself in a constant struggle for survival. One day, after a brutal encounter in an overpowered dungeon wipes out his party and threatens to end his life, a mysterious System chooses him as its sole player: Jinwoo has been granted the rare opportunity to level up his abilities, possibly beyond any known limits. Follow Jinwoo’s journey as he takes on ever-stronger enemies, both human and monster, to discover the secrets deep within the dungeons and the ultimate extent of his powers."""",
        """10 years ago, the monster horde from the rift formed from space and time started attacking the mankind. At the same time, people have started to awaken the power and began hunting the monsters for fame and money Lee SungHoon, in need of money because of his mother’s sickness, takes a dangerous job to help hunt those monsters four times a month by acting as a bait for the hunters But one day, he is heavily injured by a monster and remembers his past life as a sorcerer king ‘Huh? Did I just die?» ‘Wait, I was a Sorcerer King Kratraus in my previous life?’ With his past memories, SungHoon’s overpowered magic show begins""",
        """Nie Li was supposed to die due to an attack by mythical beasts and the sage emperor, but then time and space were distorted due to the Temporal Demon Spirit Book, he woke up to find himself back in his old classroom as his 13-year-old self. How will he protect the people he loves in his new life?""",
        """Bam, who was alone all his life has entered the tower to chase after his only friend, Rachel, but how will he survive without having any special strength or power?

"What do you desire? Money and wealth? Honor and pride? Authority and power? Revenge? Or something that transcends them all? Whatever you desire—it's here.""""
    )

    private val mangaImages = intArrayOf(
        R.drawable.apotheosis,
        R.drawable.dungeon_reset,
        R.drawable.hxh,
        R.drawable.omniscient,
        R.drawable.one_piece,
        R.drawable.remonster,
        R.drawable.returner,
        R.drawable.skeleton_soldier,
        R.drawable.solo_leveling,
        R.drawable.sorcerer_king,
        R.drawable.todg,
        R.drawable.tower_of_god
    )

    val listData: ArrayList<Manga>
        get() {
            val list = arrayListOf<Manga>()
            for (position in mangaNames.indices) {
                val manga = Manga()
                manga.name = mangaNames[position]
                manga.detail = mangaDetails[position]
                manga.photo  = mangaImages[position]
                list.add(manga)
            }
            return list
        }
}