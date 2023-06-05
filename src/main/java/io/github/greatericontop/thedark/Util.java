package io.github.greatericontop.thedark;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Util {

    public static ItemStack createItemStack(Material mat, int amount, String name, String... lore) {
        ItemStack stack = new ItemStack(mat, amount);
        ItemMeta im = stack.getItemMeta();
        im.displayName(Component.text(name));
        im.setLore(java.util.Arrays.asList(lore));
        stack.setItemMeta(im);
        return stack;
    }

}
