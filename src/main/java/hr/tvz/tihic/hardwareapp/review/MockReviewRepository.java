package hr.tvz.tihic.hardwareapp.review;

import hr.tvz.tihic.hardwareapp.hardware.Hardware;
import hr.tvz.tihic.hardwareapp.hardware.PriceUpdateCommand;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MockReviewRepository implements ReviewRepository{
    private List<Review> MOCKED_REVIEWS = new ArrayList<>(Arrays.asList(
            new Review("1", Rating.FIVE, "Savršeno za Roblox", "Napokon mogu uživati u Robloxu u 1440p kvaliteti"),
            new Review("2", Rating.ONE, "Užasno za Roblox", "Napokon ne mogu uživati u Robloxu u 1440p kvaliteti"),
            new Review("3", Rating.THREE, "Prosječno za Roblox", "Napokon mogu relativno uživati u Robloxu u 1440p kvaliteti"),
            new Review("4", Rating.FOUR, "Skroz OK za Roblox", "Napokon mogu uživati u Robloxu u 1440p kvaliteti")
    ));


    @Override
    public List<Review> findAll(){
        return MOCKED_REVIEWS;
    }
    @Override
    public Optional<Review> findByCode(final String code){
        return MOCKED_REVIEWS.stream().filter(it -> Objects.equals(it.getCode(), code)).findAny();
    }
}
