CREATE TABLE [email_tbl](
	[id] [int] NOT NULL,
	[status] [varchar](50) NULL,
	[name] [varchar](50) NULL,
	[type] [varchar](50) NULL,
	[payload] [nvarchar](max) NULL,
 CONSTRAINT [PK_email_tbl] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

CREATE UNIQUE NONCLUSTERED INDEX 
    email_tbl_idx 
    on email_tbl (id);
CREATE NONCLUSTERED INDEX
	email_tbl_status_idx
	on email_tbl (status);