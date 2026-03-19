import { defineConfig } from "vite";
import solidPlugin from "vite-plugin-solid";
import tailwindcss from "@tailwindcss/vite";

export default defineConfig({
  plugins: [
    tailwindcss(),
    solidPlugin(),
  ],

  // Tauri attend que le dev server tourne sur ce port
  server: {
    port: 1420,
    strictPort: true,
  },

  build: {
    // Tauri supporte es2021
    target: "es2021",
    // Ne pas inliner les assets pour garder le bundle léger
    assetsInlineLimit: 0,
  },

  // Empêcher Vite de masquer les erreurs Rust
  clearScreen: false,
});
