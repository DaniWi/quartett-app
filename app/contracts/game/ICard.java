package contracts.game;

import java.util.List;
import java.util.UUID;

/**
 * interface for the Card
 * @author Witsch Daniel
 *
 */
public interface ICard {

    UUID getID();

    String getName();

    int getPopulation();

    float getArea();

    float getIndebtedness();

    int getNights();

    int getSportFields();

    /**
     * 
     * @return get the URL to the image of the card
     */
    String getImageUrl();

    /**
     * 
     * @return a list of category for each card
     */
    List<ICardCategory> getCategories();

    /**
     * 
     * @return a array with the ranking of all 5 categories
     */
    Integer[] getRankingArray();

}
