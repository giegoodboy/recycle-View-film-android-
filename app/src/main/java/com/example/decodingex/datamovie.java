package com.example.decodingex;

import java.util.ArrayList;

public class datamovie {

    private static String[] namamove ={
    "A Star Is Born",
    "Aquaman",
    "Avengers: Infinity War",
    "Bird Box",
    "Bohemian Rhapsody",
    "BumbleBee",
    "Creed II",
    "Once Upon a Deadpool",
    "How to Train Your Dragon: The Hidden World",
    "Dragon Ball Super: Broly"
    };


    private static String[] genre={
    "Drama, Romance, Music",
    "Action, Adventure, Fantasy",
    "Action, Adventure, Fantasy",
    "Thriller, Drama",
    "Drama, Music",
    "Action, Adventure, Science Fiction",
    "Drama",
    "Comedy, Action",
    "Animation, Family, Adventure",
    "Action, Animation, Fantasy, Adventure, Comedy"

    };

    private static String[] tahun ={
            "2018",
            "2018",
            "2018",
            "2018",
            "2018",
            "2018",
            "2018",
            "2019",
            "2019",
            "2019",
            "2019"
    };

    private static String[] durasi={
            "2h 15m",
            "2h 24m",
            "2h 29m",
            "2h 4m",
            "2h 15m",
            "1h 54m",
            "2h 10m",
            "1h 57m",
            "1h 44m",
            "1h 41m"

    };
    private static String[] detail= {
            "Seasoned musician Jackson Maine discovers and falls in love with struggling artist Ally. She has just about given up on her dream to make it big as a singer until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm s half human, half Atlantean brother and true heir to the throne.",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment  the fate of Earth and existence itself has never been more uncertain.",
            "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock  roll band Queen in 1970. Hit songs become instant classics. When Mercury s increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family 's past, Adonis Creed is up against the challenge of his life.",
            "A kidnapped Fred Savage is forced to endure Deadpool  rendition of Deadpool 2 as a Princess Bride esque story that s full of magic, wonder and zero Fs.",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            "Earth is peaceful following the Tournament of Power. Realizing that the universes still hold many more strong people yet to see, Goku spends all his days training to reach even greater heights. Then one day, Goku and Vegeta are faced by a Saiyan called ve never seen before. The Saiyans were supposed to have been almost completely wiped out in the destruction of Planet Vegeta, so whas this one doing on Earth? This encounter between the three Saiyans who have followed completely different destinies turns into a stupendous battle, with even Frieza"

    };
    private static int[] foto={
    R.drawable.poster_a_star,
    R.drawable.poster_aquaman,
    R.drawable.poster_avengerinfinity,
    R.drawable.poster_birdbox,
    R.drawable.poster_bohemian,
    R.drawable.poster_bumblebee,
    R.drawable.poster_creed,
    R.drawable.poster_deadpool,
    R.drawable.poster_dragon,
    R.drawable.poster_dragonball
    };

    static ArrayList<movie> getListData() {
        ArrayList<movie> list = new ArrayList<>();
        for (int position = 0; position < namamove.length; position++) {
            movie movie = new movie();
            movie.setName(namamove[position]);
            movie.setDetail(detail[position]);
            movie.setTahun(tahun[position]);
            movie.setGenre(genre[position]);
            movie.setFoto(foto[position]);
            movie.setDurasi(durasi[position]);
            list.add(movie);
        }
        return list;
    }


}
