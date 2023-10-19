package com.example.netheritenugget.provider;

import com.example.netheritenugget.NetheriteNugget;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public abstract class MyLangProvider extends LanguageProvider {
    public MyLangProvider(PackOutput output, String locale) {
        super(output, NetheriteNugget.MODID, locale);
    }

    public static class LangJP extends MyLangProvider {
        public LangJP(PackOutput output) {
            super(output, "ja_jp");
        }

        @Override
        protected void addTranslations() {
            this.add(NetheriteNugget.NETHERITE_NUGGET.get(), "ネザライト塊");
        }
    }
    public static class LangUS extends MyLangProvider {
        public LangUS(PackOutput output) {
            super(output, "en_us");
        }

        @Override
        protected void addTranslations() {
            this.add(NetheriteNugget.NETHERITE_NUGGET.get(), "Netherite Nugget");
        }
    }
}
