import { defineConfig } from "vite";

export default defineConfig({
  root: "src-web",
  server: {
    port: 3000,
    open: true,
    proxy: {
      "/api": "http://127.0.0.1:8042",
      "/icons": "http://127.0.0.1:8042",
      "/ui": "http://127.0.0.1:8042",
    },
  },
  build: {
    outDir: "../dist-web",
    emptyOutDir: true,
  },
});
