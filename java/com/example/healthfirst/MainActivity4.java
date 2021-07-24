package com.example.healthfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity4 extends AppCompatActivity
{

    private static String TAG = "MainActivity5";
    //--------- C H A R T ---------//
    /*private float[] quantity = {0.14f, 0.06f, 0.05f, 0.25f, 0.1f, 0.4f};
    private String[] names = {"Vitamin C","Potassium","Vitamin K","Carbs","Fiber","Calories"};
    PieChart pieChart;*/
    //--------- C H A R T ---------//

    int[] nonvegimages =
            {
                    R.drawable.anchovy1,
                    R.drawable.carp1,
                    R.drawable.chicken1,
                    R.drawable.clam1,
                    R.drawable.cod1,
                    R.drawable.crab1,
                    R.drawable.egg1,
                    R.drawable.flyingfish1,
                    R.drawable.galjoen1,
                    R.drawable.lobster1,
                    R.drawable.mackerel1,
                    R.drawable.marlin1,
                    R.drawable.mussel1,
                    R.drawable.mutton1,
                    R.drawable.pork1,
                    R.drawable.salmon1,
                    R.drawable.sardines1,
                    R.drawable.seaurchin1,
                    R.drawable.shrimp1,
                    R.drawable.squid1,
                    R.drawable.trout1,
                    R.drawable.tuna1,
                    R.drawable.turkey1,
                    R.drawable.whole1
            };

    String title[] =
            {
                    "Anchovy fish",
                    "Carp fish",
                    "Chicken",
                    "Clam",
                    "Cod fish",
                    "Crab",
                    "Egg white",
                    "Flying fish",
                    "Galjoen fish",
                    "Lobster",
                    "Mackerel",
                    "Marlin fish",
                    "Mussel",
                    "Mutton",
                    "Pork",
                    "Salmon",
                    "Sardines",
                    "Sea urchin",
                    "Shrimp",
                    "Squid",
                    "Trout",
                    "Tuna",
                    "Turkey",
                    "Whole egg"
            };


    //the info in the array will be changed later once we display info some info in our activity
    String description[] =
            {
                    "An anchovy is a small, common forage fish of the family Engraulidae. Most species are found in marine waters, but several will enter brackish water, and some in South America are restricted to fresh water.",
                    "Carp are various species of oily freshwater fish from the family Cyprinidae, a very large group of fish native to Europe and Asia. While carp is consumed in many parts of the world, they are generally considered an invasive species in parts of Africa, Australia and most of the United States",
                    "Chicken is the most common type of poultry in the world. Owing to the relative ease and low cost of raising them in comparison to animals such as cattle or hogs, chickens have become prevalent in numerous cuisines",
                    "Clam is a common name for several kinds of bivalve molluscs. The word is often applied only to those that are edible and live as infauna, spending most of their lives halfway buried in the sand of the seafloor or riverbeds. Clams have two shells of equal size connected by two adductor muscles and have a powerful burrowing foot.",
                    "Cod is the common name for the demersal fish genus Gadus, belonging to the family Gadidae. Cod is also used as part of the common name for a number of other fish species, and one species that belongs to genus Gadus is commonly not called cod.",
                    "Crabs are decapod crustaceans of the infraorder Brachyura, which typically have a very short projecting tail, usually hidden entirely under the thorax. They live in all the world's oceans, in fresh water, and on land, are generally covered with a thick exoskeleton, and have a single pair of pincers.",
                    "Egg white is the clear liquid contained within an egg. In chickens it is formed from the layers of secretions of the anterior section of the hen's oviduct during the passage of the egg. It forms around fertilized or unfertilized egg yolks. ",
                    "The Exocoetidae are a family of marine fish in the order Beloniformes class Actinopterygii, known colloquially as flying fish or flying cod. About 64 species are grouped in seven to nine genera. While they cannot fly in the same way a bird does, flying fish can make powerful, self-propelled leaps out of the water where their long wing-like fins enable gliding for considerable distances above the water's surface",
                    "Dichistius is a genus of perciform fishes, the galjoen fishes, native to the Atlantic coast of southern Africa  and the Indian Ocean coast of southern Africa (D. multifasciatus). Growing to lengths of 80 cm (31 in)  and 35 cm (14 in) (D. multifasciatus), both known species are popular commercial and game fishes.",
                    "Lobsters have long bodies with muscular tails, and live in crevices or burrows on the sea floor. Three of their five pairs of legs have claws, including the first pair, which are usually much larger than the others. Highly prized as seafood, lobsters are economically important, and are often one of the most profitable commodities in coastal areas they populate.",
                    "Mackerel is a common name applied to a number of different species of pelagic fish, mostly from the family Scombridae. They are found in both temperate and tropical seas, mostly living along the coast or offshore in the oceanic environment.",
                    "A marlin is a fish from the family Istiophoridae, which includes about 10 species. It has an elongated body, a spear-like snout or bill, and a long, rigid dorsal fin which extends forward to form a crest. Its common name is thought to derive from its resemblance to a sailor's marlinspike.",
                    "Mussel is the common name used for members of several families of bivalve molluscs, from saltwater and freshwater habitats. These groups have in common a shell whose outline is elongated and asymmetrical compared with other edible clams, which are often more or less rounded or oval.",
                    "Lamb, hogget, and mutton, generically sheep meat, are the meat of domestic sheep, Ovis aries. A sheep in its first year is a lamb and his or her meat is also lamb. The meat from sheep in their second year are hogget.",
                    "Pork is the culinary name for the meat of a domestic pig (Sus scrofa domesticus). It is the most commonly consumed meat worldwide, with evidence of pig husbandry dating back to 5000 BC.",
                    "Salmon is the common name for several species of ray-finned fish in the family Salmonidae. Other fish in the same family include trout, char, grayling, and whitefish. Salmon are native to tributaries of the North Atlantic and Pacific Ocean. Many species of salmon have been introduced into non-native environments such as the Great Lakes of North America and Patagonia in South America. Salmon are intensively farmed in many parts of the world.",
                    "Sardines are actually several species of fish with a few things in common. They’re small and silvery with a high oil content. If you have seen them in the ocean or in a large tank at an aquarium, you probably found the sight mesmerizing. Organs called lateral lines allow a school of sardines to synchronize their swimming so they move almost as one.",
                    "Sea urchins, are typically spiny, globular animals, echinoderms in the class Echinoidea. About 950 species live on the seabed, inhabiting all oceans and depth zones from the intertidal to 5,000 metres. Their hard shells are round and spiny, usually from 3 to 10 cm across",
                    "Shrimp are decapod crustaceans with elongated bodies and a primarily swimming mode of locomotion – most commonly Caridea and Dendrobranchiata. More narrow definitions may be restricted to Caridea, to smaller species of either group or to only the marine species.",
                    "Squid are cephalopods in the superorder Decapodiformes with elongated bodies, large eyes, eight arms and two tentacles. Like all other cephalopods, squid have a distinct head, bilateral symmetry, and a mantle",
                    "Trout are species of freshwater fish belonging to the genera Oncorhynchus, Salmo and Salvelinus, all of the subfamily Salmoninae of the family Salmonidae. The word trout is also used as part of the name of some non-salmonid fish such as Cynoscion nebulosus, the spotted seatrout or speckled trout.",
                    "A tuna is a saltwater fish that belongs to the tribe Thunnini, a subgrouping of the Scombridae family. The Thunnini comprise 15 species across five genera, the sizes of which vary greatly, ranging from the bullet tuna up to the Atlantic bluefin tuna.",
                    "The turkey is a large bird in the genus Meleagris, native to North America. There are two extant turkey species: the wild turkey of eastern and central North America and the ocellated turkey of the Yucatán Peninsula in Mexico. Males of both turkey species have a distinctive fleshy wattle, called a snood, that hangs from the top of the beak. They are among the largest birds in their ranges.",
                    "Eggs are few foods used throughout the world unconcerned religion and ethnic group. Chicken egg is one of the biological items in nature and regarded as a great source of lipids, protein, minerals and vitamins."
            };


    String vitamins[] =
            {
                    "• Omega-3 fatty acids\n• Niacin\n• Vitamin B12\n• Calcium\n• Selenium\n• Potassium\n• Vitamin A",
                    "• Protein\n• Lipid fat\n• Phosphorus\n• Isoleucine\n• Lysine\n• Vitamin B12\n• Tryptophan\n• Threonine\n• Valine\n• Histidine\n• Leucine\n• Selenium\n• Niacin\n• Thiamin\n• Magnesium\n• Potassium\n• Copper",
                    "• Isoleucine\n• Tryptophan\n• Lysine\n• Histidine\n• Threonine",
                    "• Iron\n• Vitamin C\n• Vitamin B12\n• Vitamin A\n• Calcium\n• Selenium\n• Potassium",
                    "• Vitamin A\n• Vitamin D\n• Vitamin E\n• Omega-3 fatty acids \n• Protein\n• Phosphorus\n• Sodium\n• Magnesium\n• Potassium\n• Zinc",
                    "• Vitamin B12\n• Copper\n• Selenium\n• Sodium\n• Zinc\n• Tryptophan",
                    "• Isoleucine\n• Valine\n• Selenium\n• Vitamin B2\n• Tryptophan",
                    "• Protein\n• Vitamin B12\n• Selenium\n• Omega-3 fats",
                    "• Omega-3 fatty acids\n• Vitamins D\n• Vitamins B2\n• Calcium\n• Phosphorus\n• Iron\n• Zinc\n• Iodine\n• Magnesium\n• Potassium",
                    "• Copper\n• Selenium, \n• Vitamin B-12\n• Tryptophan \n• Isoleucine \n• Threonine \n• Lysine \n• Valine \n• Histidine \n• Protein",
                    "• Vitamin B-12\n• Selenium \n• Isoleucine \n• Lysine \n• Tryptophan \n• Threonine \n• Valine \n• Histidine \n• Leucine \n• Total Fat\n• Protein \n• Vitamin B3\n• Phosphorus\n• Vitamin B6\n• Vitamin B2\n• Magnesium, \n• Vitamin B5 \n• Iron, Fe \n• Vitamin B1",
                    "• Omega-3 polyunsaturated fatty acids",
                    "• Omega 3 fatty acids\n• Zinc\n• Folate\n• Selenium\n• Iodine\n• Iron\n• Vitamin C\n• Vitamin A\n• Calcium",
                    "• Thiamin\n• Vitamin B6\n• Vitamin B12\n• Phosphorus\n• Iron\n• Copper\n• Amino acids",
                    "• Histidine \n• Selenium\n• Tryptophan \n• Isoleucine \n• Lysine \n• Threonine \n• Valine \n• Leucine \n• Protein \n• Vitamin B1",
                    "• Vitamin B-12\n• Selenium\n• Isoleucine\n• Lysine\n• Tryptophan\n• Threonine\n• Vitamin B3\n• Valine\n• Histidine\n• Leucine",
                    "• Vitamin B12\n• Selenium\n• Phosphorus\n• Vitamin D\n• Calcium\n• Niacin (Vitamin B3)\n• Iodine",
                    "• Dietary fiber\n• Zinc\n• Beta Carotene\n• Vitamin C\n• Vitamin A\n• Omega-3 fatty acids",
                    "• Calories\n• Protein\n• Selenium\n• Vitamin B12\n• Iron\n• Phosphorus\n• Niacin\n• Zinc",
                    "• Vitamin B12 \n• Vitamin B6\n• Selenium\n• Vitamin E\n• Carbohydrates\n• Vitamin C\n• Iron\n• Calcium",
                    "• Calories\n• Protein\n• Fat\n• Carbohydrate\n• Fiber\n• Calcium\n• Magnesium\n• Potassium\n• Vitamin C\n• Folate\n• Vitamin A",
                    "• Vitamin B-12\n• Vitamin A\n• Selenium\n• Isoleucine\n• Lysine",
                    "• Calories\n• Protein\n• Fat\n• Carbs\n• Niacin\n• Vitamin\n• Vitamin\n• Selenium\n• Zinc\n• Sodium\n• Phosphorous\n• Choline\n• Magnesium\n• Potassium",
                    "• Isoleucine \n• Valine\n• Selenium\n• Vitamin B2\n• Tryptophan",
            };

    String prevents[] =
            {
                    "• Thyroid problems\n• Prevents Alzheimer's",
                    "• Prevent the strain on cardiovascular system\n• Lowers the inflammation\n• Lower the chances of rheumatoid arthritis\n• Prevention of osteoarthritis\n• Lower the chances of inflammatory bowel syndromes\n• Eradicate free radicals and its negative impacts\n• Prevents the chances of osteoporosis, damaged or weakened enamel\n• Slow down the process of aging\n• Prevents the chances of Alzheimer’s disease and dementia",
                    "• Weight Loss\n• Reduced Cancer Risk\n• Helps build muscles\n• Protecting the Cognitive System\n• Common Cold\n• Helps To Fight Against Depression\n• Control of Blood Pressure\n• Strengthen Teeth and Bone\n• Reduced Cholesterol\n• Heart’s Health\n• Improve the Health of Eyes\n• Reduces PMS symptoms\n• Support the Healthy Tissue Growth and Boost immunity",
                    "• Help carry oxygen in the blood\n• Helps regulate the growth of cells\n• Inhibits Cancer",
                    "• Muscle health\n• Strengthen immunity\n• Signalize nerves\n• Skin health\n• Bone health\n• Help to lower inflammation that results in rheumatoid arthritis, asthma attacks, migraines and osteoarthritis",
                    "• Healthy bones\n• Mental health\n• Heart health\n• Lowers inflammation\n• Enhance immunity\n• Prevent the chances of atherosclerosis\n• Lowers the chances of stroke and heart attack\n• Helps to eliminate the free radicals that could mutate the cells\n• Enhances the function of kidneys and eliminates toxins \n• Enhances the metabolic efficiency\n• Speeds up the healing process and cell regrowth during illness and injury",
                    "• Prevent nervous damage\n• Manage cholesterol levels\n• Build muscles\n• Balance blood pressure\n• Prevent cardio",
                    "• Lower your risk of heart attacks and strokes\n• Boost brain health\n• Prevent and treat depression",
                    "• High in important nutrients\n• Lower your risk of heart attacks and strokes\n• Contain nutrients that are crucial during development\n• Boost brain health\n• Help prevent and treat depression\n• A good dietary sources of vitamin D\n• Reduce your risk of autoimmune diseases\n• Help prevent asthma in children.",
                    "• Healthy heart\n• Cognitive health\n• Provides energy\n• Repairment\n• Lowers inflammation",
                    "• Prevents heart disease\n• Lowers risk of diabetes\n• Immunity\n• Controls blood pressure levels\n• Reduces symptoms of rheumatoid arthritis\n• Help Prevent Cancer\n• Lose weight\n• Lower Cholesterol\n• Improves cognitive function\n• Increases survival chance of bowel cancer patients",
                    "• Reduce inflammation\n• Lower the risk of heart disease\n• Lower the risk of cancer\n• Lower the risk of arthritis",
                    "• Prevents Anemia\n• Increases production of red blood cells",
                    "• Support Testosterone Synthesis\n• Source of Carnosine\n• Offers proteins\n• Prevents Anemia\n• Strong antioxidant\n• Promotes Endurance\n• Omega-3s preserves skin health, supports moisture, flexibility, retention and also strengthen antioxidant function",
                    "• High content of energy\n• High protein\n• Provides calcium\n• Presence of phosphorus\n• Prevent risk of anemia\n• Source of zinc\n• Adds taste to food\n• Maintain skin health\n• Form muscles\n• Immunity ",
                    "• Great source of nutrients\n• Insulin level\n• Cardiovascular ailments\n• Nerve and brain\n• Eye health\n• Heart health\n• Brain health\n• Enhance mood\n• Assist digestion\n• Bone health ",
                    "• Helps prevents cancer\n• Lower the risk of Alzheimer’s disease\n• Lower the risk of dementia\n• Lower the risk of cognitive function",
                    "• Promote good blood circulation\n• Boost the immune and reproductive system's capabilities",
                    "• Lose weight\n• Slows down ageing\n• Macular degeneration\n• Prevent hair loss\n• Cardiovascular problems",
                    "• Squid are considered particularly important for women who are pregnant\n• Help soothe the symptoms of rheumatoid arthritis",
                    "• Trout are a member of the Salmonidae family and are closely related to salmon and char.\n• Trout is the common name for various species, including rainbow trout, brown trout, and brook trout. Rainbow trout is commonly found in grocery stores.\n• Trout are an excellent source of protein, niacin, vitamin B12, and omega 3 fatty acids.\n• Protein is the building blocks of our body. It is important in growth and development and assists in repairing damaged tissues.\n• Niacin is important in converting the food we eat into energy as well as assisting with digestive, skin, and nerve functions within the body.\n• Vitamin B12 is required to form red blood cells which deliver oxygen throughout the body. B12 is also essential in supporting brain health and in creating DNA which holds our genetic material.\n• Omega 3 fatty acids are necessary for brain function by aiding in memory, performance, and behavior as well as assisting with normal growth and development. Research has also shown that omega 3 fatty acids reduce inflammation and may help lower your risk of chronic disease such as heart disease, cancer, and arthritis.\n• Many people have concerns about mercury and fish. Trout is an excellent option when eating fish due to its high omega 3 fatty acid content and its low levels of mercury. If eating locally caught trout, contact your DNR to find specific eating recommendations. The Wisconsin DNR has a publication called Choose Wisely, a health guide for eating fish in Wisconsin.\n• If you are interested in learning more about how to find sustainable and healthy fish to consume, check out seafoodwatch.org\n• The USDA recommends eating 8 oz. of a variety of fish each week for optimum nutrition.",
                    "• Improves your mood\n• Builds muscle\n• Prevents stroke\n• Fights kidney disease,Improves your skin health\n• Mercury and Selenium Balance\n• Weight Loss and Obesity\n• Blood Pressure\n• Reduces stress\n• Brain Health,Cell Membrane Damage\n• Energy Levels\n• Strengthens your bones\n• Heart Health\n• Good for eye health\n• Depression\n• Reduce Inflammation\n• Boosted Immune System\n• Kidney Disease\n• Blood Circulation\n• Growth and Development\n• Cancer Prevention ",
                    "• Decrease the risk of colorectal cancer\n• Decrease the risk of prostate cancer\n• Decrease the risk of lung cancer\n• Decrease the risk of bladder cancer\n• Decrease the risk of skin cancer\n• Decrease the risk of gastric cancer",
                    "• Prevent nervous damage\n• Manage cholesterol levels\n• Build muscles\n• Balance blood pressure\n• Prevent cardi",
            };

    ImageView img;

    TextView titlee, descp, vita, prev;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        //--------- C H A R T ---------//
       /* Log.d(TAG, "onCreate: starting to create chart");
        pieChart = (PieChart) findViewById(R.id.piechart);
        setupPieChart();
        loadPieChartData();*/
        //--------- C H A R T ---------//


        HashMap<String, Integer> pos = new HashMap<>();

        for(int i = 0 ; i < title.length; i++){
            pos.put(title[i],i);
        }



        String namee = getIntent().getStringExtra("foodname");
        Integer position = pos.get(namee);



        img = (ImageView) findViewById(R.id.nonvegimg);
        titlee = (TextView) findViewById(R.id.nonvegtitle);
        descp = (TextView) findViewById(R.id.nonvegdesc);
        vita = (TextView) findViewById(R.id.nonvegvit);
        prev = (TextView) findViewById(R.id.nonvegprev);

        img.setImageResource(nonvegimages[position]);
        titlee.setText(title[position]);
        descp.setText(description[position]);
        vita.setText(vitamins[position]);
        prev.setText(prevents[position]);


        /*img = nonvegimages[position];
        titlee = title[position];
        descp = description[position];
        vita = vitamins[position];
        prev = prevents[position];*/
    }

    //--------- C H A R T ---------//
    /*private void setupPieChart() {
        pieChart.setDrawHoleEnabled(true);
        pieChart.setUsePercentValues(true);
        pieChart.setEntryLabelTextSize(12);
        pieChart.setEntryLabelColor(Color.BLACK);
        pieChart.setCenterText("Vitamins & Minerals");
        pieChart.setCenterTextSize(24);
        pieChart.getDescription().setEnabled(false);

        Legend l = pieChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);
        l.setEnabled(true);
    }

    private void loadPieChartData() {
        ArrayList<PieEntry> entries = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            entries.add(new PieEntry(quantity[i], names[i]));
        }

        ArrayList<Integer> colors = new ArrayList<>();
        for (int color : ColorTemplate.MATERIAL_COLORS) {
            colors.add(color);
        }

        for (int color : ColorTemplate.VORDIPLOM_COLORS) {
            colors.add(color);
        }

        PieDataSet dataSet = new PieDataSet(entries, "Vitamins");
        dataSet.setColors(colors);

        PieData data = new PieData(dataSet);
        data.setDrawValues(true);
        data.setValueFormatter(new PercentFormatter(pieChart));
        data.setValueTextSize(12f);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);
        pieChart.invalidate();

        pieChart.animateY(1400, Easing.EaseInOutQuad);*/
        //--------- C H A R T ---------//

}
