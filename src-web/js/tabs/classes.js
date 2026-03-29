// Classes tab - stats par classe
import { esc } from "../utils.js";

export function loadClasses(classes) {
  const tbody = document.getElementById("classesTbody");
  if (!tbody) return;
  tbody.innerHTML = (classes || []).map((c, i) => `<tr>
    <td class="rank">${i + 1}</td>
    <td><span class="breed-badge">${esc(c.breedName)}</span></td>
    <td class="num">${c.count}</td>
    <td class="num high">${c.avg_poids_offensif}</td>
    <td class="num">${c.avg_level}</td>
    <td class="num">${c.max_poids_offensif}</td>
    <td>${esc(c.top_player)}</td>
  </tr>`).join("");
}
