# ACTIVE TODOLIST - 2026-03-21 19:27

## FAIT
- [x] 1. Setup agent Byte-Buddy
- [x] 2. Capture messages reseau (45003 lignes, 85 types)
- [x] 3. Classifier messages (coe=mouvement, coY=categories, cwj=effets...)
- [x] 4. Decompiler cwj, iM, eNf, eNg, eRO, QD, zP, bgG, bgJ, cru, coS, coR
- [x] 5. Decoder CWJ protobuf (13 champs iM)
- [x] 6. Identifier eNf comme registre d'effets (316 eNg, action 304=sublim)
- [x] 7. Telecharger CDN (items, actions, states, types)
- [x] 8. Creer effect_to_state_mapping.json (575 entries)
- [x] 9. Cartographier handlers: cdV(40), cdl(24), ccv(72)
- [x] 10. Identifier messages sans handler: cru(13668), coR(13928)
- [x] 11. Confirmer coS = offre HDV (mdw/mdx/mdy)

## EN COURS
- [ ] 12. Parser le blob CRU (mgi byte[]) pour extraire items+sublimations
- [ ] 13. Parser coS.mdy pour extraire details offre HDV

## BLOQUE
- [ ] 14. Trouver le handler de cru(13668) - pas dans cdV/cdl/ccv, sipush=0
- [ ] 15. Trouver le handler de coR(13928) - idem

## PROCHAINES ETAPES
- [ ] 16. Option A: Modifier agent pour logger coS.mdy et cru.mgi en detail
- [ ] 17. Option B: Chercher la constante 13668 avec ldc/ldc_w dans bytecode
- [ ] 18. Option C: Intercepter la couche Item (setStateId, addEffect)
- [ ] 19. Cross-reference items CDN avec blobs CRU/coS
- [ ] 20. Generer catalogue JSON final (items + states + sublimations)

## FAUX POSITIFS A NE PAS REPETER
- Abandon III dans CSN = concatenation index+separateur
- bgG = registre personnages, PAS effets
- F3 CWJ304 = runtime ID, PAS CDN effectId
- stateIds apparents dans CRU = probablement timestamps
