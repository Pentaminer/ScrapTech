package com.pentaminer.scraptech.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;
import com.pentaminer.scraptech.ScrapTech;

public class RoseGoldMaterial implements ToolMaterial {

    // 1. Прочность (сколько ударов/добычи выдержит)
    @Override
    public int getDurability() {
        return 500;
    }

    // 2. Скорость добычи блоков
    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0f;
    }

    // 3. Урон по блокам (не по мобам)
    @Override
    public float getAttackDamage() {
        return 1.5f;
    }

    // 4. Уровень добычи (0 дерево, 1 камень, 2 железо, 3 алмаз)
    @Override
    public int getMiningLevel() {
        return 3;
    }

    // 5. Зачаровываемость
    @Override
    public int getEnchantability() {
        return 20;
    }

    // 6. Ремонт (чем чинится инструмент)
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ScrapTech.ROSE_GOLD_INGOT);
    }
}
