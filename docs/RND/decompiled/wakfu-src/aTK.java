/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.antlr.runtime.BaseRecognizer
 *  org.antlr.runtime.DFA
 */
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.DFA;

public class aTK
extends DFA {
    public aTK(aTJ aTJ2, BaseRecognizer baseRecognizer) {
        this.recognizer = baseRecognizer;
        this.decisionNumber = 63;
        this.eot = aTJ.foX;
        this.eof = aTJ.foY;
        this.min = aTJ.foZ;
        this.max = aTJ.fpa;
        this.accept = aTJ.fpb;
        this.special = aTJ.fpc;
        this.transition = aTJ.fpd;
    }

    public String getDescription() {
        return "796:1: cmd returns [ModerationCommand cmd] : (c= stats_cmd |c= bot_cmd |c= panel_cmd |c= ping_cmd |c= time_cmd |c= who_cmd |c= where_cmd |c= teleport_me_cmd |c= teleport_player_cmd |c= serverlock_cmd |c= kick_cmd |c= kick_all_cmd |c= ban_cmd |c= ghostcheck_cmd |c= identphase_cmd |c= shutdown_cmd |c= sysmsg_cmd |c= msgall_cmd |c= symbiot_cmd |c= nation_cmd |c= achievement_cmd |c= achievement_date_cmd |c= account_achievement_reward_cmd |c= zone_buff_cmd |c= create_group_cmd |c= add_to_group_cmd |c= rights_cmd |c= chaos_cmd |c= restart_chaos_cmd |c= create_item_cmd |c= recreate_item_cmd |c= create_recipe_items_cmd |c= show_recipe_items_cmd |c= create_set_cmd |c= delete_item_cmd |c= regenerate_cmd |c= regenerate_with_item_cmd |c= turn_duration_cmd |c= pvp_cmd |c= reward_cmd |c= run_action_cmd |c= end_scenario_cmd |c= reload_scenarios_cmd |c= add_spellxp_cmd |c= set_spelllevel_cmd |c= add_skillxp_cmd |c= set_skill_level_cmd |c= add_xp_cmd |c= set_bonus_factor_cmd |c= add_money_cmd |c= help_cmd |c= god_mode_cmd |c= instance_usage_cmd |c= destroy_instance_cmd |c= show_aggro_list_cmd |c= play_animation_cmd |c= play_aps_cmd |c= set_level_cmd |c= spawn_ie_cmd |c= sessions_cmd |c= set_next_challenge_cmd |c= finish_challenge_cmd |c= staff_cmd |c= subscriber_cmd |c= mute_partitions_cmd |c= unmute_partitions_cmd |c= mute_cmd |c= unmute_cmd |c= distribute_items_cmd |c= search_cmd |c= teleport_to_breed_mob_cmd |c= buff_character_cmd |c= restore_character_cmd |c= clean_character_deleted_tables_cmd |c= set_item_tracker_log_level_cmd |c= quota_cmd |c= ragnarok_cmd |c= show_population_cmd |c= show_monster_quota_cmd |c= cancel_collect_cooldown_cmd |c= get_instance_uid_cmd |c= dump_bag_cmd |c= set_wakfu_gauge_cmd |c= temp_cmd |c= calendar_cmd |c= fight_cmd |c= protector_command |c= monster_group |c= state_command |c= scenario_cmd |c= version_cmd |c= plant_resources_cmd |c= destroy_resources_cmd |c= destroy_monsters_cmd |c= set_respawn_cmd |c= check_cmd |c= craft_cmd |c= ban_request_cmd |c= unban_request_cmd |c= pet_cmd |c= mount_cmd |c= add_itemxp_cmd |c= guild_cmd |c= companion_cmd |c= system_configuration_cmd |c= ai_cmd |c= fightchallenge_cmd |c= shard_command |c= havenworld_cmd |c= almanach_start_cmd |c= learn_emote_cmd |c= remove_emote_cmd |c= set_player_title_cmd |c= remove_player_title_cmd |c= free_access_cmd |c= create_full_group_cmd |c= inventory_cmd |c= empty_char_cmd |c= client_game_event_command |c= character_cmd |c= popup_message_cmd |c= red_message_cmd |c= red_message_to_player_cmd |c= emote_targetable_cmd |c= haven_bag_kick_cmd |c= tp_to_jail_cmd |c= freedom_cmd |c= give_item_cmd |c= listloot_cmd |c= revive_cmd |c= reset_account_market_entries_cmd |c= hero_cmd |c= global_speed_cmd |c= schedule_process_auto_message_cmd |c= dungeon_cmd |c= dungeon_ladder_cmd |c= haven_bag_cmd |c= battleground_cmd |c= market_cmd |c= ogrest_chaos_cmd |c= nation_change_cmd |c= pvp_inventory_cmd |c= infinite_waves_cmd |c= list_ie_cmd |c= lock_ie_cmd |c= bak_cmd |c= guide_cmd |c= players_quota_cmd |c= lag_cmd |c= game_account_data_cmd |c= watch_cmd |c= banned_words_cmd |c= furniture_cmd |c= cosmetic_preset_cmd |c= toggle_admin_cmd |c= connection_queue_whitelist_cmd );";
    }
}

