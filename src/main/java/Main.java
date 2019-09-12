import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import java.util.*;
import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {

    public static ArrayList<Drink> drinks = new ArrayList<>();

    public static void main(String[] args) throws LoginException {

        JDABuilder builder = new JDABuilder(AccountType.BOT);

        // Authentication Token
        String token = "XXX";
        builder.setToken(token);

        builder.addEventListeners(new Main());

        // Discord Status
        builder.setActivity(Activity.playing("Mixing drinks and changing lives"));

        builder.build();


        // Drink List

        drinks.add(new Drink("alexander", "https://i.imgur.com/knS3cfB.jpg", "- 30ml Cognac \n- 30ml Creme de Cacao \n- 30ml Fresh Cream \n- 1 Sprinkle Nutmeg \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("americano", "https://i.imgur.com/BFDw1QK.jpg", "- 30ml Campari \n- 30ml Vermouth \n- Splash of Soda Water \n- Garnish with Orange Slice \nMix on the rocks."));
        drinks.add(new Drink("amf", "https://i.ytimg.com/vi/jmWC90GCi4A/maxresdefault.jpg", "- 15ml Vodka \n- 15ml Gin \n- 15ml White Rum \n- 15ml Tequila \n- 15ml Blue Curacao \n- 30ml Lemon Juice \n- 8ml Simple Syrup \n- Top w/ Lemon-Lime Soda \nShake everything but the soda and strain into a glass with ice. Top with soda and garnish with a lemon wedge."));
        drinks.add(new Drink("angel face", "https://i.imgur.com/cEwrqUL.jpg", "- 30ml Calvados \n- 30ml Gin \n- 30ml Apricot Brandy \nShake and strain into a cocktail glass."));
        drinks.add(new Drink("aviation", "https://i.imgur.com/tNwDtDZ.jpg", "- 45ml Gin \n- 15ml Maraschino Liqueur \n- 15ml Lemon Juice \n- 1 tsp Creme de Violette (optional) \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("b52", "https://i.imgur.com/NFrcD6z.jpg", "- 20ml Grand Marnier \n- 20ml Baileys Irish Cream \n- 20ml Kahlua \nLayer in reverse order in shot glass."));
        drinks.add(new Drink("bacardi", "https://i.imgur.com/CdLvMA9.jpg", "- 45ml Bacardi White Rum \n- 20ml Lime Juice \n- 10ml Grenadine \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("barracuda", "https://i.imgur.com/EQV120r.png", "- 45ml Gold Rum \n- 15ml Galliano \n- 60ml Pineapple Juice \n- 60ml Prosecco \n- 1 dash Lime Juice \nStir gently in glass and serve."));
        drinks.add(new Drink("bellini", "https://i.imgur.com/EDrJHvU.jpg", "- 100ml Prosecco \n- 50ml fresh Peach Puree \nCombine in glass, puree first, and stir gently."));
        drinks.add(new Drink("between the sheets", "https://i.imgur.com/qsjC730.jpg", "- 30ml Cognac \n- 30ml White Rum \n- 30ml Triple Sec \n- 20ml Lemon Juice \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("black russian", "https://i.imgur.com/PoQNhKm.jpg", "- 50ml Vodka \n- 20ml Coffee Liqueur \nServe on the rocks and mixed."));
        drinks.add(new Drink("white russian", "https://cdn.liquor.com/wp-content/uploads/2017/12/20073201/white-russian-720x720-article.jpg", "- 50ml Vodka \n- 20ml Coffee Liqueur \n- 20ml Fresh Cream \nServe on the rocks and mixed."));
        drinks.add(new Drink("bloody mary", "https://i.imgur.com/Cm7PpMx.jpg", "- 45ml Vodka \n- 90ml Tomato Juice \n- 15ml Lemon Juice \n- 2 Dashes Worcestershire Sauce \n- 1 Dash Tabasco \n- 1 Pinch Celery Salt \n- 1 Pinch Pepper \nStir gently and pour into a highball glass rimmed with celery salt."));
        drinks.add(new Drink("bramble", "https://i.imgur.com/WgfXOpA.jpg", "- 40ml Gin \n- 10ml Sugar Syrup \n- 15ml Lemon Juice \n- 15ml Blackberry Liqueur \nMix the gin, syrup, and lemon juice over crushed ice and pour blackberry liqueur over the top in a circular fashion. Garnish with a lemon slice and two blackberries."));
        drinks.add(new Drink("caipirinha", "https://i.imgur.com/ZQgxGND.jpg", "- 50ml Cachaca \n- 4 Lime Wedges \n- 2tsp Sugar \nMuddle lime and sugar in a rocks glass, then add ice and Cachaca."));
        drinks.add(new Drink("casino", "https://i.imgur.com/FohmOuQ.jpg", "- 40ml Old Tom Gin \n- 10ml Maraschino Liqueur \n- 10ml Orange Bitters \n- 10ml Lemon Juice \nShake and strain into a chilled cocktail glass. Garnish with a lemon twist and maraschino cherry."));
        drinks.add(new Drink("champagne cocktail", "https://i.imgur.com/69dScit.jpg", "- 90ml chilled Champagne \n- 10ml Cognac \n- 2 dashes Angostura Bitters \n- 1 Sugar Cube \n- 1 Maraschino Cherry \nSoak the sugar cube in the bitters, then combine in champagne glass with the rest."));
        drinks.add(new Drink("clover club", "https://i.imgur.com/ByG0zJf.jpg", "- 45ml Gin \n- 15ml Raspberry Syrup \n- 15ml Lemon Juice \n- A few Drops of Egg Whites \nShake well and strain into a cocktail glass."));
        drinks.add(new Drink("cosmopolitan", "https://i.imgur.com/2fjofAm.jpg", "- 40ml Lemon Vodka \n- 15ml Cointreau \n- 30ml Cranberry Juice \n- 15ml Lime Juice \nShake and strain into a cocktail glass. Garnish with a slice of lime."));
        drinks.add(new Drink("cuba libre", "https://i.imgur.com/KFXUtFy.jpg", "- 50ml White Rum \n- 120ml Cola \n- 10ml Lime Juice \nBuild in a highball glass with ice. Garnish with a lime wedge."));
        drinks.add(new Drink("daiquiri", "https://i.imgur.com/nMGt7GP.jpg", "- 45ml White Rum \n- 15ml Simple Syrup \n- 25ml Fresh Lime Juice \nShake and strain into a cocktail glass."));
        drinks.add(new Drink("dark and stormy", "https://i.imgur.com/UTJDER2.jpg", "- 60ml Dark Rum \n- 100ml Ginger Beer \n- 1 Lime Wedge (squeezed) \nPour straight into a highball glass filled with ice. Garnish with a lime wedge."));
        drinks.add(new Drink("derby", "https://i.imgur.com/YqzMIbQ.png", "- 60ml Gin \n- 2 Drops Peach Bitters \n- 2 Fresh Mint Leaves \nStir and strain into a cocktail glass. Garnish with fresh mint leaves."));
        drinks.add(new Drink("dirty martini", "https://i.imgur.com/NXmRCAh.jpg", "- 60ml Vodka \n- 10ml Dry Vermouth \n- 10ml Olive Juice \nStir and strain into a chilled cocktail glass. Garnish with a green olive."));
        drinks.add(new Drink("dry martini", "https://i.imgur.com/FdOaZmu.jpg", "- 60ml Gin \n- 10ml Dry Vermouth \nStir and strain into a chilled cocktail glass. Garnish with a green olive."));
        drinks.add(new Drink("espresso martini", "https://i.imgur.com/cmRqXsD.jpg", "- 50ml Vodka \n- 10ml Kahlua \n- 25ml Strong Espresso \n- Sugar Syrup to Taste \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("french 75", "https://i.imgur.com/Lw677ZX.jpg", "- 30ml Gin \n- 15ml Lemon Juice \n- 2 Dashes Sugar Syrup \n- 60ml Champagne \nShake gin, lemon juice, and syrup then strain into champagne glass and top with champagne. Stir gently."));
        drinks.add(new Drink("french connection", "https://i.imgur.com/ekqtCaF.jpg", "- 35ml Cognac \n- 35ml Amaretto \nCombine in a rocks glass with ice and stir gently."));
        drinks.add(new Drink("french martini", "https://i.imgur.com/U9Td2y4.jpg", "- 45ml Vodka \n- 15ml Raspberry Liqueur \n- 15ml Pineapple Juice \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("gin fizz", "https://i.imgur.com/q3Wic3d.jpg", "- 45ml Gin \n- 10ml Sugar Syrup \n- 30ml Lemon Juice \n- 80ml Soda Water \nShake the gin, syrup, and lemon juice then strain into a glass and top with soda water. Garnish with a lemon slice."));
        drinks.add(new Drink("girl scout", "https://farm6.staticflickr.com/5715/23544669169_3ef418a017_o.png", "- 44ml Baileys \n- 44ml Creme de Menthe \n- 44ml Chocolate Liqueur \n- 22ml Peppermint Schnapps \nShake and strain into a glass with ice."));
        drinks.add(new Drink("godfather", "https://i.imgur.com/gmzR4vU.jpg", "- 35ml Scotch \n- 35ml Amaretto \nPour into a rocks glass with ice. Stir gently."));
        drinks.add(new Drink("godmother", "https://i.imgur.com/zUxtp6X.jpg", "- 35ml Vodka \n- 35ml Amaretto \nPour into a rocks glass with ice. Stir gently."));
        drinks.add(new Drink("golden dream", "https://i.imgur.com/WYQBk4V.jpg", "- 20ml Galliano \n- 20ml Triple Sec \n- 20ml Orange Juice \n- 10ml Fresh Cream \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("grasshopper", "https://i.imgur.com/4Xr5iPp.jpg", "- 30ml Creme de Cacao \n- 30ml Creme de Menthe \n- 30ml Fresh Cream \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("harvey wallbanger", "https://i.imgur.com/x4qi29G.jpg", "- 45ml Vodka \n- 90ml Orange Juice \n- 15ml Galliano \nPour the vodka and OJ into a highball glass filled with ice. Stir gently and float the Galliano on top. Garnish with orange slices and a cherry."));
        drinks.add(new Drink("hemingway special", "https://i.imgur.com/Jn52vcS.jpg", "- 60ml White Rum \n- 15ml Maraschino Liqueur \n- 40ml Grapefruit Juice \n- 15ml Lime Juice \nShake and strain into a cocktail glass."));
        drinks.add(new Drink("horses neck", "https://i.imgur.com/7WoOB42.jpg", "- 40ml Brandy \n- 120ml Ginger Ale \n- 1 Dash Angostura Bitters \nPour the brandy and ginger ale into a highball glass filled with ice. Stir gently and add a dash of bitters. Garnish with a lemon spiral."));
        drinks.add(new Drink("irish coffee", "https://i.imgur.com/Sjvbtau.jpg", "- 40ml Irish Whiskey \n- 90ml Hot Coffee \n- 30ml Fresh Cream \n- 1tsp Brown Sugar \nWarm the whiskey over a flame and pour into a glass with the coffee. Then add sugar and float the cream on top."));
        drinks.add(new Drink("jager bomb", "https://cdn.liquor.com/wp-content/uploads/2015/10/16191117/il_570xN.528303243_h6ai.jpg", "- 45ml Jagermeister \n- 1 Can Red Bull \nFill a shot glass with the Jagermeister and set aside. Fill a rocks glass to the brim with Red Bull. When serving, drop the shot glass into the rocks glass. It's gonna get messy!"));
        drinks.add(new Drink("john collins", "https://i.imgur.com/5Qg2qiQ.jpg", "- 45ml Gin \n- 15ml Sugar Syrup \n- 30ml Lemon Juice \n- 60ml Soda Water \n- 1 Dash Angostura Bitters \nPour into a highball glass filled with ice and stir gently. Garnish with a lemon slice and a maraschino cherry. Top with a dash of bitters."));
        drinks.add(new Drink("kamikaze", "https://i.imgur.com/OAC9RlK.jpg", "- 30ml Vodka \n- 30ml Triple Sec \n- 30ml Lime Juice \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("kir", "https://i.imgur.com/5qiw4VT.jpg", "- 90ml Dry White Wine \n- 10ml Creme de Cassis \nPour the creme de cassis into a glass and top up with white wine."));
        drinks.add(new Drink("lemon drop", "https://i.imgur.com/NMoVn5L.jpg", "- 25ml Lemon Vodka \n- 20ml Triple Sec \n- 15ml Lemon Juice \nShake and strain into a chilled cocktail glass rimmed with sugar. Garnish with a slice of lemon."));
        drinks.add(new Drink("liquid marijuana", "https://tipsybartender.com/wp-content/uploads/2018/02/Liquid-Marijuana-Cocktail.jpg", "- 22ml Spiced Rum \n- 22ml Midori \n- 22ml Coconut Rum \n- 22ml Blue Curacao \n- 30ml Sweet & Sour \n- 30ml Pineapple Juice \nBuild in a glass filled with ice."));
        drinks.add(new Drink("long island iced tea", "https://i.imgur.com/ZByE8GX.jpg", "- 15ml Gin \n- 15ml Tequila \n- 15ml Vodka \n- 15ml White Rum \n- 15ml Triple Sec \n- 30ml Sugar Syrup \n- 25ml Lemon Juice \n- Top w/ Cola \nPour into a highball glass and top off with cola. Stir gently. Garnish with a lemon slice and straw."));
        drinks.add(new Drink("mai tai", "https://i.imgur.com/kvSJurH.jpg", "- 40ml White Rum \n- 20ml Dark Rum \n- 15ml Orange Curacao \n- 15ml Orgeat Syrup \n- 10ml Lime Juice \nShake and strain into a highball glass. Garnish with a pineapple spear, mint leaves, lime peel, and a straw."));
        drinks.add(new Drink("manhattan", "https://i.imgur.com/tjhHVN3.jpg", "- 50ml Rye Whiskey \n- 20ml Red Vermouth \n- 1 Dash Angostura Bitters \nStir and strain into a chilled cocktail glass. Garnish with a maraschino cherry."));
        drinks.add(new Drink("margarita", "https://i.imgur.com/aTU0Pay.jpg", "- 35ml Tequila \n- 20ml Cointreau \n- 15ml Lime Juice \nShake and strain into a cocktail glass rimmed with salt."));
        drinks.add(new Drink("mary pickford", "https://i.imgur.com/DumEnm7.jpg", "- 60ml White Rum \n- 10ml Maraschino Liqueur \n- 10ml Grenadine Syrup \n- 60ml Pineapple Juice \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("mimosa", "https://i.imgur.com/rHdJZbs.jpg", "- 75ml Champagne \n- 75ml Orange Juice \nPour the OJ into a champagne flute and add the champagne. Stir gently."));
        drinks.add(new Drink("mint julep", "https://i.imgur.com/tM9d2hs.jpg", "- 60ml Bourbon Whiskey \n- 4 Mint Sprigs \n- 1tsp Powdered Sugar \n- 2tsp Water \nMuddle the mint, sugar, and water in a highball glass. Add ice and bourbon. Stir and garnish with a mint sprig."));
        drinks.add(new Drink("mojito", "https://i.imgur.com/afofRjZ.jpg", "- 40ml White Cuban Rum \n- 30ml Lime Juice \n- 6 Mint Sprigs \n- 2tsp Sugar \n- Top w/ Soda Water \nMuddle the mint sprigs with sugar and lime juice. Add ice and rum then top with soda water. Garnish with a mint sprig and lemon slice. Serve with a straw."));
        drinks.add(new Drink("monkey gland", "https://i.imgur.com/0yKWG1y.jpg", "- 50ml Gin \n- 30ml Orange Juice \n- 2 Drops Absinthe \n- 2 Drops Grenadine \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("moscow mule", "https://i.imgur.com/EdDPWCr.jpg", "- 45ml Vodka \n- 120ml Ginger Beer \n- 5ml Lime Juice \n- 1 Lime Slice \nMix ingredients in a copper mug with crushed ice. Garnish with a lime slice."));
        drinks.add(new Drink("naughty school girl", "https://i.pinimg.com/originals/34/1d/2c/341d2c181bb0ccaaf9ea81c91a23ba05.jpg", "- 20ml Mango Rum \n- 20ml Watermelon Vodka \n- 20ml Pineapple Juice \nShake and strain into a 2oz shot glass, or scale up to fill a glass."));
        drinks.add(new Drink("negroni", "https://i.imgur.com/yd3v7Qp.jpg", "- 30ml Gin \n- 30ml Campari \n- 30ml Sweet Red Vermouth \nPour all ingredients into a rocks glass filled with ice. Stir gently and garnish with a half orange slice."));
        drinks.add(new Drink("old fashioned", "https://i.imgur.com/YaWDoPi.jpg", "- 45ml Bourbon or Rye Whiskey \n- 2 Dashes Angostura Bitters \n- 1 Sugar Cube \n- Few Dashes Water \nPlace a sugar cube in a rocks glass and saturate with bitters. Add water and muddle. Fill the glass with ice and add the whiskey. Garnish with an orange slice and a cocktail cherry."));
        drinks.add(new Drink("paradise", "https://i.imgur.com/RoWL80V.jpg", "- 35ml Gin \n- 20ml Apricot Brandy \n- 15ml Orange Juice \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("pina colada", "https://i.imgur.com/e5RhqNf.jpg", "- 30ml White Rum \n- 90ml Pineapple Juice \n- 30ml Coconut Cream \nBlend all of the ingredients with ice in an electric blender and pour into a large wide glass. Garnish with a slice of pineapple and a cocktail cherry. Serve with a straw."));
        drinks.add(new Drink("pisco sour", "https://i.imgur.com/jGaa97i.jpg", "- 45ml Pisco \n- 20ml Sugar Syrup \n- 30ml Lemon Juice \n- 1 Small Egg White \n- 1 Dash Angostura Bitters \nShake and strain into a chilled glass. Dash the bitters on top."));
        drinks.add(new Drink("planters punch", "https://i.imgur.com/81BXHNh.jpg", "- 45ml Dark Rum \n- 35ml Orange Juice \n- 35ml Pineapple Juice \n- 20ml Lemon Juice, 10ml Grenadine, 10ml Sugar Syrup, 3 Dashes Angostura Bitters. Shake and strain into a large glass with ice. Dash the bitters on top. Garnish with a cocktail cherry and a pineapple spear."));
        drinks.add(new Drink("porto flip", "https://i.imgur.com/VarmYfs.jpg", "- 15ml Brandy \n- 45ml Red Port \n- 10ml Egg Yolk \nShake and strain into a cocktail glass and sprinkle with ground nutmeg."));
        drinks.add(new Drink("ramos gin fizz", "https://i.imgur.com/6o7gA20.jpg", "- 45ml Gin \n- 30ml Sugar Syrup \n- 15ml Lime Juice \n- 15ml Lemon Juice \n- 60ml Cream \n- 1 Egg White \n- 3 Dashes Orange Flower Water \n- 2 Drops Vanilla Extract \n- Top w/ Soda Water \nPour all of the ingredients except the soda in a mixing glass. Shake with no ice for two minutes, then add ice and shake hard for another minute. Strain into a highball glass without ice and top with soda."));
        drinks.add(new Drink("red snapper", "https://www.crownroyal.com/wp-content/uploads/2018/02/unnamed-1.png", "- 36ml Crown Royal \n- 8 oz Amaretto \n- 175ml Cranberry Juice \nCombine in a highball glass with ice. Stir and garnish with an orange peel."));
        drinks.add(new Drink("rose", "https://i.imgur.com/NSNv0zX.jpg", "- 20ml Kirsch \n- 40ml Dry Vermouth \n- 3 Dashes Strawberry Syrup \nStir and strain into a cocktail glass."));
        drinks.add(new Drink("russian spring punch", "https://i.imgur.com/oCpFnDF.jpg", "- 25ml Vodka \n- 15ml Creme de Cassis \n- 10ml Sugar Syrup \n- 25ml Lemon Juice \n- 75ml Champagne or Prosecco \nShake and strain into a highball glass filled with ice. Top with Champagne/Prosecco. Garnish with a lemon slice and a blackberry."));
        drinks.add(new Drink("rusty nail", "https://i.imgur.com/01QIped.jpg", "- 45ml Scotch \n- 25ml Drambuie \nPour into a rocks glass filled with ice. Stir gently and garnish with a lemon twist."));
        drinks.add(new Drink("sazerac", "https://i.imgur.com/WG853ha.jpg", "- 50ml Cognac \n- 10ml Absinthe \n- 1 Sugar Cube \n- 2 Dashes Peychaud's Bitters \nRinse a chilled rocks glass with the absinthe, add crushed ice, and set aside. In a mixing glass, saturate the sugar cube with bitters. Add the cognac and stir with ice. Discard the contents of the rocks glass and strain the drink into it. Garnish with a lemon peel."));
        drinks.add(new Drink("sea breeze", "https://i.imgur.com/H88BjkR.jpg", "- 40ml Vodka \n- 120ml Cranberry Juice \n- 30ml Grapefruit Juice \n- 1 Lime Wedge \nBuild in a rocks glass filled with ice. Garnish with a lime wedge."));
        drinks.add(new Drink("sex on the beach", "https://i.imgur.com/UlWzzvX.jpg", "- 40ml Vodka \n- 20ml Peach Schnapps \n- 40ml Cranberry Juice \n- 40ml Orange Juice \nBuild in a highball glass filled with ice. Garnish with an orange slice."));
        drinks.add(new Drink("screwdriver", "https://i.imgur.com/k1R1rur.jpg", "- 50ml Vodka \n- 100ml Orange Juice \nPour into a highball glass filled with ice. Stir gently and garnish with an orange slice."));
        drinks.add(new Drink("sidecar", "https://i.imgur.com/w2QhefG.jpg", "- 50ml Cognac \n- 20ml Triple Sec \n- 20ml Lemon Juice \nShake and strain into a cocktail glass rimmed with sugar."));
        drinks.add(new Drink("singapore sling", "https://i.imgur.com/azHa1td.jpg", "- 30ml Gin \n- 15ml Cherry Liqueur \n- 7.5ml Cointreau \n- 7.5ml DOM Benedictine \n- 10ml Grenadine \n- 120ml Pineapple Juice \n- 15ml Lime Juice \n- 1 Dash Angostura Bitters \nShake and strain into a highball glass. Garnish with a pineapple slice and a cocktail cherry."));
        drinks.add(new Drink("spritz veneziano", "https://i.imgur.com/QCOXm17.jpg", "- 60ml Prosecco \n- 40ml Aperol \n- Splash of Soda Water \nBuild in a rocks glass filled with ice. Top with soda water and garnish with a half orange slice."));
        drinks.add(new Drink("stinger", "https://i.imgur.com/K7nLzU3.jpg", "- 50ml Cognac \n- 20ml White Creme de Menthe \nStir and strain into a cocktail glass."));
        drinks.add(new Drink("tequila sunrise", "https://i.imgur.com/pzkvQqm.jpg", "- 45ml Tequila \n- 90ml Orange Juice \n- 15ml Grenadine \nPour the tequila and OJ directly into a highball glass with ice cubes. Add a splash of grenadine to create a chromatic effect and do not stir. Garnish with an orange slice and a cherry."));
        drinks.add(new Drink("tom collins", "https://cdn.liquor.com/wp-content/uploads/2010/12/04114905/tom-collins-720-720-recipe.jpg", "- 45ml Old Tom Gin \n- 15ml Sugar Syrup \n- 30ml Lemon Juice \n- 60ml Soda Water \n- 1 Dash Angostura Bitters \nPour into a highball glass filled with ice and stir gently. Garnish with a lemon slice and a maraschino cherry. Top with a dash of bitters."));
        drinks.add(new Drink("tommys margarita", "https://i.imgur.com/DoEoEV1.jpg", "- 45ml Tequila \n- 15ml Lime Juice \n- 10ml Agave Nectar \nShake and strain into a chilled cocktail glass."));
        drinks.add(new Drink("tuxedo", "https://i.imgur.com/ea9yQEq.jpg", "- 30ml Old Tom Gin \n- 30ml Dry Vermouth \n- 1/2tsp Maraschino \n- 1/4tsp Absinthe \n- 3 Dashes Orange Bitters \nStir and strain into a cocktail glass. Garnish with a cocktail cherry and a lemon twist."));
        drinks.add(new Drink("vampiro", "http://res.cloudinary.com/sagacity/image/upload/c_crop,h_809,w_640,x_0,y_100/c_scale,w_640/v1403634045/0714-mexican-margaritas-vampiro-el-big-bad_tfw0ie.jpg", "- 50ml Tequila \n- 70ml Tomato Juice \n- 30ml Orange Juice \n- 10ml Lime Juice \n- 1tsp Clear Honey \n- 1/2 Slice Finely Chopped Onion \n- 3 Slices Red Hot Chili Peppers \n- 3 Drops Worcestershire Sauce \n- Salt to Taste \nShake and strain into a highball glass. Garnish with a chili pepper."));
        drinks.add(new Drink("vesper", "https://i.imgur.com/mZHqYOe.jpg", "- 60ml Gin \n- 15ml Vodka \n- 7.5ml Lillet Blanc \nShake and strain into a chilled cocktail glass. Garnish with a lemon twist."));
        drinks.add(new Drink("whiskey sour", "https://i.imgur.com/uJTwqVo.jpg", "- 45ml Bourbon Whiskey \n- 15ml Sugar Syrup \n- 30ml Lemon Juice \n- Dash of Egg White \nShake and strain into a rocks glass with ice. Garnish with a half orange slice and a maraschino cherry."));
        drinks.add(new Drink("whiteclaw","https://d1ynl4hb5mx7r8.cloudfront.net/wp-content/uploads/2016/06/24130110/WhiteClaw1-300x244.jpg","The legend itself! Adored by white girls, chads, and hipsters alike, White Claw has become an obsession for many across the United States. Described by some as a 4LOKO that went to private school, this hard seltzer is easy to drink and dangerously tasty."));
        drinks.add(new Drink("white lady", "https://i.imgur.com/maJ7y5f.jpg", "- 40ml Gin \n- 30ml Triple Sec \n- 20ml Lemon Juice \nShake and strain into a cocktail glass."));
        drinks.add(new Drink("yellow bird", "https://i.imgur.com/nD9J7Xj.jpg", "- 30ml White Rum \n- 15ml Galliano \n- 15ml Triple Sec \n- 15ml Lime Juice \nShake and strain into a chilled cocktail glass."));








    }

    // Discord Commands and Responses

    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        System.out.println("We received a message from " + event.getAuthor().getName() + ": " + event.getMessage().getContentDisplay());

        // Defining Author and Bot for Bot Ignore Line

        User author = event.getAuthor();
        boolean bot = author.isBot();

        // Ignore Text Without ~, Ignore Bots

        if (event.getMessage().getContentRaw().startsWith("~") && !bot);
        else {
            return;
        }

        // Ping Pong!

        if (event.getMessage().getContentRaw().equals("~ping")) {
            event.getChannel().sendMessage("Pong!").queue();
        }

        // Author Information

        if (event.getMessage().getContentRaw().equals("~author")) {
            event.getChannel().sendMessage("Created and maintained with love by FakeSummer#2112 <3").queue();
        }

        // Coin Flip

        Random rand2 = new Random();
        if (event.getMessage().getContentRaw().equals("~flipcoin")) {
            int roll = rand2.nextInt(2) + 1;
            if (roll == 1) {
                event.getChannel().sendMessage("Heads!").queue();
            } else {
                event.getChannel().sendMessage("Tails!").queue();
            }
            }

        // Help Command

        if (event.getMessage().getContentRaw().equals("~help")) {
            event.getChannel().sendMessage("My current list of commands are: ~drinklist, ~search, ~i [ingredient], ~r [drink], ~flipcoin, ~author, and ~ping").queue();
        }

        // Search Command (Outputs Applicable Commands for Search Types)

        if (event.getMessage().getContentRaw().equals("~search")) {
            event.getChannel().sendMessage("If you'd like to search by drink, please type ~r [drink]. If you'd like to search by ingredient, type ~i [ingredient]. For a full list, type ~drinklist <3").queue();
        }

        // Full Drink List Command

        String finalList = "Drinks? Here are the ones that I know: ";
       for(int i = 0; i < drinks.size(); i++) {
           Drink listOfDrinks = drinks.get(i);
           finalList = finalList + listOfDrinks.name + ", ";
           }
        if (event.getMessage().getContentRaw().equals("~drinklist")) {
            int lastComma = finalList.lastIndexOf(",");
            finalList = finalList.substring(0, lastComma) + ".";
            event.getChannel().sendMessage(finalList).queue();
       }

        // Search By Ingredient

        String ingredientMessage = event.getMessage().getContentRaw();
        String iMessage = ingredientMessage.substring(3);
        String iDrinks = "Here is a list of drinks that contain " + iMessage + ": ";
        for(int i = 0; i <drinks.size(); i++) {
            Drink currentDrink = drinks.get(i);
            if (currentDrink.contains(Character.toUpperCase(iMessage.charAt(0)) + iMessage.substring(1))) {
                iDrinks = iDrinks + currentDrink.name + ", ";
            }
        }
            if (event.getMessage().getContentRaw().equals("~i " + iMessage)) {
                int lastComma2 = iDrinks.lastIndexOf(",");
                iDrinks = iDrinks.substring(0, lastComma2) + ".";
                event.getChannel().sendMessage(iDrinks).queue();
            }

        // Search by Drink for Recipe

        for (int i=0; i < drinks.size();  i++) {
            Drink currentDrink = drinks.get(i);
                if (event.getMessage().getContentRaw().equals("~r " + currentDrink.name)) {
                    drinks.get(i);
                        event.getChannel().sendMessage(currentDrink.url).queue();
                        event.getChannel().sendMessage(currentDrink.recipe).queue();
                }
            }
        }

    }
