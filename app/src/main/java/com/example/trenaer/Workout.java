package com.example.trenaer;

public class Workout {

    private String name;
    private String description;
    private int fotka;

    public static Workout[] workouts ={
            new Workout("1. ćwiczenie szóstki Weidera","Leżymy na płaskim podłożu ręce wzdłuż tłowia. Unosimy na zmiane jedną noge tak aby w kolanie i biodrze zachować kąt 90 stopni jednocześnie unosząc barki tak aby nie odrywać tłowia od podłoża Wytrzymujemy w tej pozycji 3 s Zachowując maksymalne napięcie mięśni Możemy objąć dłońmi kolana ale nie przytrzymujemy.",R.raw.cw1),

            new Workout("2. ćwiczenie szóstki Weidera","W tym ćwiczeniu unosimy jednocześnie obie nogi. Przytrzymujemy około 3 s.",R.raw.cw2),

            new Workout("3. ćwiczenie szóstki Weidera","Cwiczenie wykonujemy analogicznie do 1 z tym, że splatamy ręce na karku.",R.raw.cw3),

            new Workout("4. ćwiczenie szóstki Weidera","Cwiczenie wykonujemy analogicznie do 2 z tym, że splatamy ręce na karku.",R.raw.cw4),

            new Workout("5. ćwiczenie szóstki Weidera","W tym ćwiczeniu unosimy część barkową tułowia i utrzymując napięcie mięśni brzucha robimy nożyce. Ręce splatamy na karku.",R.raw.cw5),

            new Workout("6. ćwiczenie szóstki Weidera","W tym ćwiczeniu unosimy jednocześnie część barkową tułowia i obie wyprostowane nogi. Przytrzymujemy 3 s.",R.raw.cw6),

            new Workout("Rozpiska","1 dzień 1 seria 6 powtórzeń.\n2 dzień 2 seria 6 powtórzeń.\n3 dzień 2 seria 6 powtórzeń.\n4 dzień 3 seria 6 powtórzeń.\n5 dzień 3 seria 6 powtórzeń.\n6 dzień 3 seria 6 powtórzeń.\n7 dzień 3 seria 8 powtórzeń.\n8 dzień 3 seria 8 powtórzeń.\n" +
                    "9 dzień 3 seria 8 powtórzeń.\n10 dzień 3 seria 8 powtórzeń.\n11 dzień 3 seria 10 powtórzeń.\n12 dzień 3 seria 10 powtórzeń.\n13 dzień 3 seria 10 powtórzeń.\n14 dzień 3 seria 10 powtórzeń.\n15 dzień 3 seria 12 powtórzeń.\n" +
                    "16 dzień 3 seria 12 powtórzeń.\n17 dzień 3 seria 12 powtórzeń.\n18 dzień 3 seria 12 powtórzeń.\n19 dzień 3 seria 12 powtórzeń.\n20 dzień 3 seria 14 powtórzeń.\n21 dzień 3 seria 14 powtórzeń.\n22 dzień 3 seria 14 powtórzeń.\n" +
                    "23 dzień 3 seria 16 powtórzeń.\n24 dzień 3 seria 16 powtórzeń.\n25 dzień 3 seria 16 powtórzeń.\n26 dzień 3 seria 16 powtórzeń.\n27 dzień 3 seria 18 powtórzeń.\n28 dzień 3 seria 18 powtórzeń.\n29 dzień 3 seria 18 powtórzeń.\n30 dzień 3 seria 18 powtórzeń.\n" +
                    "31 dzień 3 seria 20 powtórzeń.\n32 dzień 3 seria 20 powtórzeń.\n33 dzień 3 seria 20 powtórzeń.\n34 dzień 3 seria 20 powtórzeń.\n35 dzień 3 seria 22 powtórzeń.\n36 dzień 3 seria 22 powtórzeń.\n" +
                    "37 dzień 3 seria 22 powtórzeń.\n38 dzień 3 seria 22 powtórzeń.\n39 dzień 3 seria 24 powtórzeń.\n40 dzień 3 seria 24 powtórzeń.\n41 dzień 3 seria 24 powtórzeń.\n42 dzień 3 seria 24 powtórzeń.\n",R.raw.okejka)


    };






    private Workout(String name, String description, int fotka)
    {
        this.name=name;
        this.description=description;
        this.fotka=fotka;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }
    public int getFotka(){
        return fotka;
    }


    @Override
    public String toString() {
        return this.name;
    }
}
