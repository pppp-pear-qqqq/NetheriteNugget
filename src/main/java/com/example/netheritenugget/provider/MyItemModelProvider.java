package com.example.netheritenugget.provider;

import com.example.netheritenugget.NetheriteNugget;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MyItemModelProvider extends ItemModelProvider {
    public MyItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NetheriteNugget.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.singleTexture("netherite_nugget", mcLoc(folder + "/generated"), "layer0", new ResourceLocation("netheritenugget", folder + "/" + "netherite_nugget"));
    }
}
