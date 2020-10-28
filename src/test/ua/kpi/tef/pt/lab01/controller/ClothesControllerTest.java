package ua.kpi.tef.pt.lab01.controller;

import org.junit.jupiter.api.Test;
import ua.kpi.tef.pt.lab01.exceptions.InvalidClothesIdException;
import ua.kpi.tef.pt.lab01.exceptions.InvalidClothingSectionException;

import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class ClothesControllerTest {

    ClothesController clothesController = new ClothesController();

    @Test
    public void createLowerBodyClothesShouldNotThrow() {
        assertDoesNotThrow(() -> clothesController.createClothes(1));
    }

    @Test
    public void createUpperBodyClothesShouldNotThrow() {
        assertDoesNotThrow(() -> clothesController.createClothes(2));
    }

    @Test
    public void createWrongClothesSectionShouldThrow() {
        assertThrows(InvalidClothingSectionException.class ,() -> clothesController.createClothes(0));
        assertThrows(InvalidClothingSectionException.class ,() -> clothesController.createClothes(3));
    }

    @Test
    public void editWrongClothesSectionShouldThrow() {
        assertThrows(InvalidClothesIdException.class ,() -> clothesController.editClothes(-1));
        assertThrows(InvalidClothesIdException.class ,() -> clothesController.deleteClothes(-1));
    }

    @Test
    public void createAndDeleteLowerClothes() {
        AtomicLong id = new AtomicLong();

        assertDoesNotThrow(() -> id.set(clothesController.createClothes(1)));
        assertDoesNotThrow(() -> clothesController.showClothes(id.get()));
        assertDoesNotThrow(() -> clothesController.deleteClothes(id.get()));
        assertThrows(InvalidClothesIdException.class, () -> clothesController.showClothes(id.get()));
    }

    @Test
    public void createAndEditLowerClothes() {
        AtomicLong id = new AtomicLong();

        assertDoesNotThrow(() -> id.set(clothesController.createClothes(1)));
        assertDoesNotThrow(() -> clothesController.editClothes(id.get()));
        assertDoesNotThrow(() -> clothesController.showClothes(id.get()));
    }

    @Test
    public void createAndDeleteUpperClothes() {
        AtomicLong id = new AtomicLong();

        assertDoesNotThrow(() -> id.set(clothesController.createClothes(2)));
        assertDoesNotThrow(() -> clothesController.showClothes(id.get()));
        assertDoesNotThrow(() -> clothesController.deleteClothes(id.get()));
        assertThrows(InvalidClothesIdException.class, () -> clothesController.showClothes(id.get()));
    }

    @Test
    public void createAndEditUpperClothes() {
        AtomicLong id = new AtomicLong();

        assertDoesNotThrow(() -> id.set(clothesController.createClothes(2)));
        assertDoesNotThrow(() -> clothesController.editClothes(id.get()));
        assertDoesNotThrow(() -> clothesController.showClothes(id.get()));
    }

}