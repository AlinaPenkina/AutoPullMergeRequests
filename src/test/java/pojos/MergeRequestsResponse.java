package pojos;

import lombok.Data;

import java.util.ArrayList;

@Data
public class MergeRequestsResponse {

    public int id;
    public int iid;
    public int project_id;
    public String title;
    public String description;
    public String state;
    public String created_at;
    public String updated_at;
    public String merged_by;
    public String merge_user;
    public String merged_at;
    public String closed_by;
    public String closed_at;
    public String target_branch;
    public String source_branch;
    public int user_notes_count;
    public int upvotes;
    public int downvotes;
    public Author author;
    public ArrayList<String> assignees;
    public String assignee;
    public ArrayList<String> reviewers;
    public int source_project_id;
    public int target_project_id;
    public ArrayList<String> labels;
    public boolean draft;
    public boolean work_in_progress;
    public String milestone;
    public boolean merge_when_pipeline_succeeds;
    public String merge_status;
    public String sha;
    public String merge_commit_sha;
    public String squash_commit_sha;
    public String discussion_locked;
    public String should_remove_source_branch;
    public boolean force_remove_source_branch;
    public String reference;
    public References references;
    public String web_url;
    public TimeStats time_stats;
    public boolean squash;
    public TaskCompletionStatus task_completion_status;
    public boolean has_conflicts;
    public boolean blocking_discussions_resolved;
    public String approvals_before_merge;
}
