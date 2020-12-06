package com.andresnp.orangefrogstickerpack;

import java.util.ArrayList;
import java.util.List;

public class StickersDataFactory {
    public static List<Sticker> getAllStickerReference() {
        String[] stickerURLRef = {
                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_CandycaneMisty.png?alt=media&token=7cbdee1e-cedd-4871-bf65-f91e8793d89d",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_MistletoePlop.png?alt=media&token=8671a75c-3819-4a6b-b802-71471a3c170e",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_NewYearMisty.png?alt=media&token=f23eee25-6fa3-4f8a-a71a-e115dcf3e766",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_NewYearMistyPlop.png?alt=media&token=30cfefd8-8695-414c-ac6b-4fa2e19f0878",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_NewYearPlop.png?alt=media&token=67bd20ba-3108-45ff-a852-851eae250d5f",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_NewYearSpark.png?alt=media&token=6257f88c-5394-4611-8317-8713e98df512",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_OrangeFrogMask.png?alt=media&token=b1c08aaa-cdbc-4104-9e25-fe042a276830",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_ReindeerBump.png?alt=media&token=a149d57b-6f43-48d1-98e6-e9b57ce991ba",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_SantaBull.png?alt=media&token=5683d559-b71a-43c8-92ea-052605c180d1",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_SnowedSpark.png?alt=media&token=edfe4b94-33b5-43d5-8e82-6311a927a5ca",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300FestiveEmoji_SnowmanSpark.png?alt=media&token=d3bdc0b7-fb0d-4e49-9a80-6988f4d277c2",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300Grinch_Frog.png?alt=media&token=ef842929-b113-44ff-b72c-08b7b357ca42",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300Spark_Sticker_LoveHeart.png?alt=media&token=3289e750-2040-4177-bccd-41aaf43270ce",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/300Spark_Sticker_LoveyEyes.png?alt=media&token=45c07e8a-2845-4dac-8b28-e8fc0bdee57f",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/Bull_Frankenstein.png?alt=media&token=7994b376-bfa9-4508-9b25-e2cf1dba128b",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/Bump_Dracula.png?alt=media&token=7aefd079-7f3f-4a9c-91f7-b7a9fe0f51ac",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker1.png?alt=media&token=68d9fd12-f626-4c5e-b096-a4e89f655a0a",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker10.png?alt=media&token=d7349bae-de86-4c4f-aadb-4cef3027664b",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker11.png?alt=media&token=17a3be7a-fa0b-4012-9056-7d5a417973c8",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker12.png?alt=media&token=1fce23af-f708-4419-ad91-229492493924",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker13.png?alt=media&token=56858a08-2248-40e2-a2a0-f45413627d5e",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker14.png?alt=media&token=f4ccf790-407c-413a-9307-ee9f63920955",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker15.png?alt=media&token=12763a9a-6bc3-4c91-8c63-0eaa5361ffc9",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker16.png?alt=media&token=b7343e55-3200-4968-a011-c90c78630638",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker2.png?alt=media&token=930779be-8268-48c5-961d-f63d0f462643",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker3.png?alt=media&token=15633fcf-87e5-4c01-9c19-4c6524423c0d",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker4.png?alt=media&token=a2e51226-e268-4516-97f5-a5d086cbe6df",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker5.png?alt=media&token=6bee285a-04cf-40bd-bb04-153da32d72b8",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker6.png?alt=media&token=10cb5140-2107-4999-84c3-9f98c57a1648",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker7.png?alt=media&token=be4f8d2f-0a2d-4b16-a7f5-b7f3adee9631",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker8.png?alt=media&token=317e8a2d-6afc-49be-836d-2d14fb4beba1",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/SparkSticker9.png?alt=media&token=a6bf64b5-827f-461c-b2df-88498c4d4a46",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker-all-leaves.png?alt=media&token=97885588-4c98-4052-941a-a81518e0ac51",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker-all-thankgsgiving.png?alt=media&token=2cf5e8eb-7ace-4a90-87e7-24a86c347575",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker-Bull-thankgsgiving.png?alt=media&token=1e741706-bdbd-49b5-ac02-8b60c32a6cc4",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker-heron.png?alt=media&token=e67b4cf9-7d48-4b5b-9acf-dbfed30201bc",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker-pirate.png?alt=media&token=33d5a23e-15a3-4ae6-a379-9ea8789e8d9a",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker-plop-leaves.png?alt=media&token=371a10b5-fad7-4edf-83d4-e3b0205dac88",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker-pumpkin-Patch.png?alt=media&token=5aeb9276-1606-44a0-8317-d2fb076a9ad0",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker-Spark-Pump.png?alt=media&token=99f87156-fcd3-4861-9dcb-60d5c8c9e3d5",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker-spark-thankgsgiving.png?alt=media&token=a8d1d2a8-e702-422f-89fc-498dfcbc4e96",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker-witch.png?alt=media&token=920cfc92-1bd5-47c1-ad68-92bb14946cac",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/sticker_Bull_Pump.png?alt=media&token=9b91bde1-4bb1-4d74-a2d7-2adfcd92a446",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/Zombie_Boy.png?alt=media&token=ca2530bd-4436-45dd-85b5-bf1c878a9298",

                "https://firebasestorage.googleapis.com/v0/b/orangefrogstickerpack.appspot.com/o/Zombie_Girl.png?alt=media&token=a5591eaf-de95-4502-bb14-4010a9871e7a"
        };
        List<Sticker> stickerList = new ArrayList<>();
        for (int i = 0; i < stickerURLRef.length; i++) {
            stickerList.add(new Sticker(stickerURLRef[i]));
        }
        return stickerList;
    }
}
